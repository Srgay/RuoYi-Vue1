package com.ruoyi.healthrecords.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.healthrecords.domain.Waizhen;
import com.ruoyi.healthrecords.service.IWaizhenService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 外诊记录Controller
 *
 * @author ruoyi
 * @date 2020-10-29
 */
@RestController
@RequestMapping("/healthrecords/waizhen")
public class WaizhenController extends BaseController
{
    @Autowired
    private IWaizhenService waizhenService;

    /**
     * 查询外诊记录列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:waizhen:list')")
    @GetMapping("/list")
    public TableDataInfo list(Waizhen waizhen)
    {
        startPage();
        List<Waizhen> list = waizhenService.selectWaizhenList(waizhen);
        return getDataTable(list);
    }

    /**
     * 导出外诊记录列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:waizhen:export')")
    @Log(title = "外诊记录", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Waizhen waizhen)
    {
        List<Waizhen> list = waizhenService.selectWaizhenList(waizhen);
        ExcelUtil<Waizhen> util = new ExcelUtil<Waizhen>(Waizhen.class);
        return util.exportExcel(list, "waizhen");
    }

    /**
    * 导入外诊记录列表
    */
    @PreAuthorize("@ss.hasPermi('healthrecords:waizhen:import')")
    @PostMapping("/importData")
    @ResponseBody
    @Log(title = "外诊记录", businessType = BusinessType.IMPORT)
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<Waizhen> util = new ExcelUtil<Waizhen>(Waizhen.class);
        List<Waizhen> list = util.importExcel(file.getInputStream());
        String message = waizhenService.importData(list, updateSupport);
        return AjaxResult.success(message);
    }

    @GetMapping("/importTemplate")
    public AjaxResult importTemplate()
    {
        ExcelUtil<Waizhen> util = new ExcelUtil<Waizhen>(Waizhen.class);
        return util.importTemplateExcel("用户数据");
    }

    /**
     * 获取外诊记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:waizhen:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(waizhenService.selectWaizhenById(id));
    }

    /**
     * 新增外诊记录
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:waizhen:add')")
    @Log(title = "外诊记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Waizhen waizhen)
    {
        return toAjax(waizhenService.insertWaizhen(waizhen));
    }

    /**
     * 修改外诊记录
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:waizhen:edit')")
    @Log(title = "外诊记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Waizhen waizhen)
    {
        return toAjax(waizhenService.updateWaizhen(waizhen));
    }

    /**
     * 删除外诊记录
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:waizhen:remove')")
    @Log(title = "外诊记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(waizhenService.deleteWaizhenByIds(ids));
    }
}
