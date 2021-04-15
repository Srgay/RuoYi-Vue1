package com.ruoyi.healthrecords.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.healthrecords.domain.HealthCheck;
import com.ruoyi.healthrecords.service.IHealthCheckService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 定期健康状况Controller
 *
 * @author ry
 * @date 2020-10-29
 */
@RestController
@RequestMapping("/healthrecords/healthcheck")
public class HealthCheckController extends BaseController
{
    @Autowired
    private IHealthCheckService healthCheckService;

    /**
     * 查询定期健康状况列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthcheck:list')")
    @GetMapping("/list")
    public TableDataInfo list(HealthCheck healthCheck)
    {
        startPage();
        List<HealthCheck> list = healthCheckService.selectHealthCheckList(healthCheck);
        return getDataTable(list);
    }

    /**
     * 导出定期健康状况列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthcheck:export')")
    @Log(title = "定期健康状况", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HealthCheck healthCheck)
    {
        List<HealthCheck> list = healthCheckService.selectHealthCheckList(healthCheck);
        ExcelUtil<HealthCheck> util = new ExcelUtil<HealthCheck>(HealthCheck.class);
        return util.exportExcel(list, "healthcheck");
    }

    /**
    * 导入定期健康状况列表
    */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthcheck:import')")
    @PostMapping("/importData")
    @ResponseBody
    @Log(title = "定期健康状况", businessType = BusinessType.IMPORT)
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<HealthCheck> util = new ExcelUtil<HealthCheck>(HealthCheck.class);
        List<HealthCheck> list = util.importExcel(file.getInputStream());
        String message = healthCheckService.importData(list, updateSupport);
        return AjaxResult.success(message);
    }

    @GetMapping("/importTemplate")
    public AjaxResult importTemplate()
    {
        ExcelUtil<HealthCheck> util = new ExcelUtil<HealthCheck>(HealthCheck.class);
        return util.importTemplateExcel("用户数据");
    }

    /**
     * 获取定期健康状况详细信息
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthcheck:query')")
    @GetMapping(value = "/{fileNum}")
    public AjaxResult getInfo(@PathVariable("fileNum") Long fileNum)
    {
        return AjaxResult.success(healthCheckService.selectHealthCheckById(fileNum));
    }

    /**
     * 新增定期健康状况
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthcheck:add')")
    @Log(title = "定期健康状况", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HealthCheck healthCheck)
    {
        return toAjax(healthCheckService.insertHealthCheck(healthCheck));
    }

    /**
     * 修改定期健康状况
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthcheck:edit')")
    @Log(title = "定期健康状况", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HealthCheck healthCheck)
    {
        return toAjax(healthCheckService.updateHealthCheck(healthCheck));
    }

    /**
     * 删除定期健康状况
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthcheck:remove')")
    @Log(title = "定期健康状况", businessType = BusinessType.DELETE)
	@DeleteMapping("/{fileNums}")
    public AjaxResult remove(@PathVariable Long[] fileNums)
    {
        return toAjax(healthCheckService.deleteHealthCheckByIds(fileNums));
    }
}
