package com.ruoyi.healthrecords.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.healthrecords.domain.HealthInfo;
import com.ruoyi.healthrecords.service.IHealthInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 戒毒情况Controller
 *
 * @author ry
 * @date 2020-10-29
 */
@RestController
@RequestMapping("/healthrecords/healthinfo")
public class HealthInfoController extends BaseController
{
    @Autowired
    private IHealthInfoService healthInfoService;

    /**
     * 查询戒毒情况列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthinfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(HealthInfo healthInfo)
    {
        startPage();
        List<HealthInfo> list = healthInfoService.selectHealthInfoList(healthInfo);
        return getDataTable(list);
    }

    /**
     * 导出戒毒情况列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthinfo:export')")
    @Log(title = "戒毒情况", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HealthInfo healthInfo)
    {
        List<HealthInfo> list = healthInfoService.selectHealthInfoList(healthInfo);
        ExcelUtil<HealthInfo> util = new ExcelUtil<HealthInfo>(HealthInfo.class);
        return util.exportExcel(list, "healthinfo");
    }

    /**
    * 导入戒毒情况列表
    */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthinfo:import')")
    @PostMapping("/importData")
    @ResponseBody
    @Log(title = "戒毒情况", businessType = BusinessType.IMPORT)
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<HealthInfo> util = new ExcelUtil<HealthInfo>(HealthInfo.class);
        List<HealthInfo> list = util.importExcel(file.getInputStream());
        String message = healthInfoService.importData(list, updateSupport);
        return AjaxResult.success(message);
    }

    @GetMapping("/importTemplate")
    public AjaxResult importTemplate()
    {
        ExcelUtil<HealthInfo> util = new ExcelUtil<HealthInfo>(HealthInfo.class);
        return util.importTemplateExcel("用户数据");
    }

    /**
     * 获取戒毒情况详细信息
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthinfo:query')")
    @GetMapping(value = "/{fileNum}")
    public AjaxResult getInfo(@PathVariable("fileNum") Long fileNum)
    {
        return AjaxResult.success(healthInfoService.selectHealthInfoById(fileNum));
    }

    /**
     * 新增戒毒情况
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthinfo:add')")
    @Log(title = "戒毒情况", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HealthInfo healthInfo)
    {
        return toAjax(healthInfoService.insertHealthInfo(healthInfo));
    }

    /**
     * 修改戒毒情况
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthinfo:edit')")
    @Log(title = "戒毒情况", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HealthInfo healthInfo)
    {
        return toAjax(healthInfoService.updateHealthInfo(healthInfo));
    }

    /**
     * 删除戒毒情况
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:healthinfo:remove')")
    @Log(title = "戒毒情况", businessType = BusinessType.DELETE)
	@DeleteMapping("/{fileNums}")
    public AjaxResult remove(@PathVariable Long[] fileNums)
    {
        return toAjax(healthInfoService.deleteHealthInfoByIds(fileNums));
    }
}
