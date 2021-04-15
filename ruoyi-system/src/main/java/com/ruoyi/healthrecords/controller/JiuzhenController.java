package com.ruoyi.healthrecords.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.healthrecords.domain.Jiuzhen;
import com.ruoyi.healthrecords.service.IJiuzhenService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 就诊记录Controller
 *
 * @author ry
 * @date 2020-10-29
 */
@RestController
@RequestMapping("/healthrecords/jiuzhen")
public class JiuzhenController extends BaseController
{
    @Autowired
    private IJiuzhenService jiuzhenService;

    /**
     * 查询就诊记录列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:jiuzhen:list')")
    @GetMapping("/list")
    public TableDataInfo list(Jiuzhen jiuzhen)
    {
        startPage();
        List<Jiuzhen> list = jiuzhenService.selectJiuzhenList(jiuzhen);
        return getDataTable(list);
    }

    /**
     * 导出就诊记录列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:jiuzhen:export')")
    @Log(title = "就诊记录", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Jiuzhen jiuzhen)
    {
        List<Jiuzhen> list = jiuzhenService.selectJiuzhenList(jiuzhen);
        ExcelUtil<Jiuzhen> util = new ExcelUtil<Jiuzhen>(Jiuzhen.class);
        return util.exportExcel(list, "jiuzhen");
    }

    /**
    * 导入就诊记录列表
    */
    @PreAuthorize("@ss.hasPermi('healthrecords:jiuzhen:import')")
    @PostMapping("/importData")
    @ResponseBody
    @Log(title = "就诊记录", businessType = BusinessType.IMPORT)
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<Jiuzhen> util = new ExcelUtil<Jiuzhen>(Jiuzhen.class);
        List<Jiuzhen> list = util.importExcel(file.getInputStream());
        String message = jiuzhenService.importData(list, updateSupport);
        return AjaxResult.success(message);
    }

    @GetMapping("/importTemplate")
    public AjaxResult importTemplate()
    {
        ExcelUtil<Jiuzhen> util = new ExcelUtil<Jiuzhen>(Jiuzhen.class);
        return util.importTemplateExcel("用户数据");
    }

    /**
     * 获取就诊记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:jiuzhen:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(jiuzhenService.selectJiuzhenById(id));
    }

    /**
     * 新增就诊记录
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:jiuzhen:add')")
    @Log(title = "就诊记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Jiuzhen jiuzhen)
    {
        return toAjax(jiuzhenService.insertJiuzhen(jiuzhen));
    }

    /**
     * 修改就诊记录
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:jiuzhen:edit')")
    @Log(title = "就诊记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Jiuzhen jiuzhen)
    {
        return toAjax(jiuzhenService.updateJiuzhen(jiuzhen));
    }

    /**
     * 删除就诊记录
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:jiuzhen:remove')")
    @Log(title = "就诊记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(jiuzhenService.deleteJiuzhenByIds(ids));
    }
}
