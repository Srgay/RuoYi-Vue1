package com.ruoyi.healthrecords.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.healthrecords.domain.HealthOut;
import com.ruoyi.healthrecords.service.IHealthOutService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 出所健康状况Controller
 *
 * @author ruoyi
 * @date 2020-10-29
 */
@RestController
@RequestMapping("/healthrecords/healthout")
public class HealthOutController extends BaseController
{
    @Autowired
    private IHealthOutService healthOutService;

    /**
     * 查询出所健康状况列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthout:list')")
    @GetMapping("/list")
    public TableDataInfo list(HealthOut healthOut)
    {
        startPage();
        List<HealthOut> list = healthOutService.selectHealthOutList(healthOut);
        return getDataTable(list);
    }

    /**
     * 导出出所健康状况列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthout:export')")
    @Log(title = "出所健康状况", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HealthOut healthOut)
    {
        List<HealthOut> list = healthOutService.selectHealthOutList(healthOut);
        ExcelUtil<HealthOut> util = new ExcelUtil<HealthOut>(HealthOut.class);
        return util.exportExcel(list, "healthout");
    }

    /**
    * 导入出所健康状况列表
    */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthout:import')")
    @PostMapping("/importData")
    @ResponseBody
    @Log(title = "出所健康状况", businessType = BusinessType.IMPORT)
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<HealthOut> util = new ExcelUtil<HealthOut>(HealthOut.class);
        List<HealthOut> list = util.importExcel(file.getInputStream());
        String message = healthOutService.importData(list, updateSupport);
        return AjaxResult.success(message);
    }

    @GetMapping("/importTemplate")
    public AjaxResult importTemplate()
    {
        ExcelUtil<HealthOut> util = new ExcelUtil<HealthOut>(HealthOut.class);
        return util.importTemplateExcel("用户数据");
    }

    /**
     * 获取出所健康状况详细信息
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthout:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(healthOutService.selectHealthOutById(id));
    }

    /**
     * 新增出所健康状况
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthout:add')")
    @Log(title = "出所健康状况", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HealthOut healthOut)
    {
        return toAjax(healthOutService.insertHealthOut(healthOut));
    }

    /**
     * 修改出所健康状况
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthout:edit')")
    @Log(title = "出所健康状况", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HealthOut healthOut)
    {
        return toAjax(healthOutService.updateHealthOut(healthOut));
    }

    /**
     * 删除出所健康状况
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthout:remove')")
    @Log(title = "出所健康状况", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(healthOutService.deleteHealthOutByIds(ids));
    }
}
