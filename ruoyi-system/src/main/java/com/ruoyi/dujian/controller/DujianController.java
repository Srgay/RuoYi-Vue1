package com.ruoyi.dujian.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.dujian.domain.Dujian;
import com.ruoyi.dujian.service.IDujianService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 毒品检查Controller
 *
 * @author ry
 * @date 2020-10-29
 */
@RestController
@RequestMapping("/dujian/dujian")
public class DujianController extends BaseController
{
    @Autowired
    private IDujianService dujianService;

    /**
     * 查询毒品检查列表
     */
    @PreAuthorize("@ss.hasPermi('dujian:dujian:list')")
    @GetMapping("/list")
    public TableDataInfo list(Dujian dujian)
    {
        startPage();
        List<Dujian> list = dujianService.selectDujianList(dujian);
        return getDataTable(list);
    }

    /**
     * 导出毒品检查列表
     */
    @PreAuthorize("@ss.hasPermi('dujian:dujian:export')")
    @Log(title = "毒品检查", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Dujian dujian)
    {
        List<Dujian> list = dujianService.selectDujianList(dujian);
        ExcelUtil<Dujian> util = new ExcelUtil<Dujian>(Dujian.class);
        return util.exportExcel(list, "dujian");
    }

    /**
    * 导入毒品检查列表
    */
    @PreAuthorize("@ss.hasPermi('dujian:dujian:import')")
    @PostMapping("/importData")
    @ResponseBody
    @Log(title = "毒品检查", businessType = BusinessType.IMPORT)
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<Dujian> util = new ExcelUtil<Dujian>(Dujian.class);
        List<Dujian> list = util.importExcel(file.getInputStream());
        String message = dujianService.importData(list, updateSupport);
        return AjaxResult.success(message);
    }

    @GetMapping("/importTemplate")
    public AjaxResult importTemplate()
    {
        ExcelUtil<Dujian> util = new ExcelUtil<Dujian>(Dujian.class);
        return util.importTemplateExcel("用户数据");
    }

    /**
     * 获取毒品检查详细信息
     */
    @PreAuthorize("@ss.hasPermi('dujian:dujian:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dujianService.selectDujianById(id));
    }

    /**
     * 新增毒品检查
     */
    @PreAuthorize("@ss.hasPermi('dujian:dujian:add')")
    @Log(title = "毒品检查", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Dujian dujian)
    {
        return toAjax(dujianService.insertDujian(dujian));
    }

    /**
     * 修改毒品检查
     */
    @PreAuthorize("@ss.hasPermi('dujian:dujian:edit')")
    @Log(title = "毒品检查", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Dujian dujian)
    {
        return toAjax(dujianService.updateDujian(dujian));
    }

    /**
     * 删除毒品检查
     */
    @PreAuthorize("@ss.hasPermi('dujian:dujian:remove')")
    @Log(title = "毒品检查", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dujianService.deleteDujianByIds(ids));
    }
}
