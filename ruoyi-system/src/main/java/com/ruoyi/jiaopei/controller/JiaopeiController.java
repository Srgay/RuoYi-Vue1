package com.ruoyi.jiaopei.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.jiaopei.domain.Jiaopei;
import com.ruoyi.jiaopei.service.IJiaopeiService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 教育培训Controller
 *
 * @author ry
 * @date 2020-10-29
 */
@RestController
@RequestMapping("/jiaopei/jiaopei")
public class JiaopeiController extends BaseController
{
    @Autowired
    private IJiaopeiService jiaopeiService;

    /**
     * 查询教育培训列表
     */
    @PreAuthorize("@ss.hasPermi('jiaopei:jiaopei:list')")
    @GetMapping("/list")
    public TableDataInfo list(Jiaopei jiaopei)
    {
        startPage();
        List<Jiaopei> list = jiaopeiService.selectJiaopeiList(jiaopei);
        return getDataTable(list);
    }

    /**
     * 导出教育培训列表
     */
    @PreAuthorize("@ss.hasPermi('jiaopei:jiaopei:export')")
    @Log(title = "教育培训", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Jiaopei jiaopei)
    {
        List<Jiaopei> list = jiaopeiService.selectJiaopeiList(jiaopei);
        ExcelUtil<Jiaopei> util = new ExcelUtil<Jiaopei>(Jiaopei.class);
        return util.exportExcel(list, "jiaopei");
    }

    /**
    * 导入教育培训列表
    */
    @PreAuthorize("@ss.hasPermi('jiaopei:jiaopei:import')")
    @PostMapping("/importData")
    @ResponseBody
    @Log(title = "教育培训", businessType = BusinessType.IMPORT)
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<Jiaopei> util = new ExcelUtil<Jiaopei>(Jiaopei.class);
        List<Jiaopei> list = util.importExcel(file.getInputStream());
        String message = jiaopeiService.importData(list, updateSupport);
        return AjaxResult.success(message);
    }

    @GetMapping("/importTemplate")
    public AjaxResult importTemplate()
    {
        ExcelUtil<Jiaopei> util = new ExcelUtil<Jiaopei>(Jiaopei.class);
        return util.importTemplateExcel("用户数据");
    }

    /**
     * 获取教育培训详细信息
     */
    @PreAuthorize("@ss.hasPermi('jiaopei:jiaopei:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(jiaopeiService.selectJiaopeiById(id));
    }

    /**
     * 新增教育培训
     */
    @PreAuthorize("@ss.hasPermi('jiaopei:jiaopei:add')")
    @Log(title = "教育培训", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Jiaopei jiaopei)
    {
        return toAjax(jiaopeiService.insertJiaopei(jiaopei));
    }

    /**
     * 修改教育培训
     */
    @PreAuthorize("@ss.hasPermi('jiaopei:jiaopei:edit')")
    @Log(title = "教育培训", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Jiaopei jiaopei)
    {
        return toAjax(jiaopeiService.updateJiaopei(jiaopei));
    }

    /**
     * 删除教育培训
     */
    @PreAuthorize("@ss.hasPermi('jiaopei:jiaopei:remove')")
    @Log(title = "教育培训", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(jiaopeiService.deleteJiaopeiByIds(ids));
    }
}
