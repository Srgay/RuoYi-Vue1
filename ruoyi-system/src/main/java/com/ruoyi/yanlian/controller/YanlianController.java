package com.ruoyi.yanlian.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.yanlian.domain.Yanlian;
import com.ruoyi.yanlian.service.IYanlianService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 应急演练Controller
 *
 * @author ry
 * @date 2020-10-29
 */
@RestController
@RequestMapping("/yanlian/yanlian")
public class YanlianController extends BaseController
{
    @Autowired
    private IYanlianService yanlianService;

    /**
     * 查询应急演练列表
     */
    @PreAuthorize("@ss.hasPermi('yanlian:yanlian:list')")
    @GetMapping("/list")
    public TableDataInfo list(Yanlian yanlian)
    {
        startPage();
        List<Yanlian> list = yanlianService.selectYanlianList(yanlian);
        return getDataTable(list);
    }

    /**
     * 导出应急演练列表
     */
    @PreAuthorize("@ss.hasPermi('yanlian:yanlian:export')")
    @Log(title = "应急演练", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Yanlian yanlian)
    {
        List<Yanlian> list = yanlianService.selectYanlianList(yanlian);
        ExcelUtil<Yanlian> util = new ExcelUtil<Yanlian>(Yanlian.class);
        return util.exportExcel(list, "yanlian");
    }

    /**
    * 导入应急演练列表
    */
    @PreAuthorize("@ss.hasPermi('yanlian:yanlian:import')")
    @PostMapping("/importData")
    @ResponseBody
    @Log(title = "应急演练", businessType = BusinessType.IMPORT)
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<Yanlian> util = new ExcelUtil<Yanlian>(Yanlian.class);
        List<Yanlian> list = util.importExcel(file.getInputStream());
        String message = yanlianService.importData(list, updateSupport);
        return AjaxResult.success(message);
    }

    @GetMapping("/importTemplate")
    public AjaxResult importTemplate()
    {
        ExcelUtil<Yanlian> util = new ExcelUtil<Yanlian>(Yanlian.class);
        return util.importTemplateExcel("用户数据");
    }

    /**
     * 获取应急演练详细信息
     */
    @PreAuthorize("@ss.hasPermi('yanlian:yanlian:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(yanlianService.selectYanlianById(id));
    }

    /**
     * 新增应急演练
     */
    @PreAuthorize("@ss.hasPermi('yanlian:yanlian:add')")
    @Log(title = "应急演练", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Yanlian yanlian)
    {
        return toAjax(yanlianService.insertYanlian(yanlian));
    }

    /**
     * 修改应急演练
     */
    @PreAuthorize("@ss.hasPermi('yanlian:yanlian:edit')")
    @Log(title = "应急演练", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Yanlian yanlian)
    {
        return toAjax(yanlianService.updateYanlian(yanlian));
    }

    /**
     * 删除应急演练
     */
    @PreAuthorize("@ss.hasPermi('yanlian:yanlian:remove')")
    @Log(title = "应急演练", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(yanlianService.deleteYanlianByIds(ids));
    }
}
