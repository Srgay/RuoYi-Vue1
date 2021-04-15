package com.ruoyi.healthrecords.controller;

import java.util.List;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.healthrecords.domain.HealthIn;
import com.ruoyi.healthrecords.domain.HealthInfo;
import com.ruoyi.healthrecords.service.IHealthInService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 入所健康状况Controller
 *
 * @author ruoyi
 * @date 2020-10-25
 */
@RestController
@RequestMapping("/healthrecords/healthin")
public class HealthInController extends BaseController
{
    @Autowired
    private IHealthInService healthInService;

    /**
     * 查询入所健康状况列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthin:list')")
    @GetMapping("/list")
    public TableDataInfo list(HealthIn healthIn)
    {
        startPage();
        List<HealthIn> list = healthInService.selectHealthInList(healthIn);
        return getDataTable(list);
    }

    /**
     * 导出入所健康状况列表(Excel)
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthin:export')")
    @Log(title = "入所健康状况", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HealthIn healthIn)
    {
        List<HealthIn> list = healthInService.selectHealthInList(healthIn);
        ExcelUtil<HealthIn> util = new ExcelUtil<HealthIn>(HealthIn.class);
        return util.exportExcel(list, "healthin");
    }
    /**
     * 导出入所健康状况列表(Word)
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthin:export')")
    @Log(title = "入所健康状况", businessType = BusinessType.EXPORT)
    @GetMapping("/exportWord")
    public AjaxResult exportWord(HealthIn healthIn)
    {
        List<HealthIn> list = healthInService.selectHealthInList(healthIn);
        ExcelUtil<HealthIn> util = new ExcelUtil<HealthIn>(HealthIn.class);
        return util.exportExcel(list, "healthin");
    }
    /**
     * 导入入所健康状况列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthin:import')")
    @PostMapping("/importData")
    @ResponseBody
    @Log(title = "入所健康状况", businessType = BusinessType.IMPORT)
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<HealthIn> util = new ExcelUtil<HealthIn>(HealthIn.class);
        List<HealthIn> list = util.importExcel(file.getInputStream());
        String message = healthInService.importData(list, updateSupport);
        return AjaxResult.success(message);
    }

    @GetMapping("/importTemplate")
    public AjaxResult importTemplate()
    {
        ExcelUtil<HealthIn> util = new ExcelUtil<HealthIn>(HealthIn.class);
        return util.importTemplateExcel("用户数据");
    }

    /**
     * 获取入所健康状况详细信息
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthin:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(healthInService.selectHealthInById(id));
    }

    /**
     * 新增入所健康状况
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthin:add')")
    @Log(title = "入所健康状况", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HealthIn healthIn)
    {
        return toAjax(healthInService.insertHealthIn(healthIn));
    }

    /**
     * 修改入所健康状况
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthin:edit')")
    @Log(title = "入所健康状况", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HealthIn healthIn)
    {
        return toAjax(healthInService.updateHealthIn(healthIn));
    }

    /**
     * 删除入所健康状况
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthin:remove')")
    @Log(title = "入所健康状况", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(healthInService.deleteHealthInByIds(ids));
    }
}
