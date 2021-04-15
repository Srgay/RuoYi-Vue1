package com.ruoyi.healthrecords.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.healthrecords.domain.Chuanshai;
import com.ruoyi.healthrecords.service.IChuanshaiService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 传染病筛选Controller
 *
 * @author ry
 * @date 2020-10-29
 */
@RestController
@RequestMapping("/healthrecords/chuanshai")
public class ChuanshaiController extends BaseController
{
    @Autowired
    private IChuanshaiService chuanshaiService;

    /**
     * 查询传染病筛选列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:chuanshai:list')")
    @GetMapping("/list")
    public TableDataInfo list(Chuanshai chuanshai)
    {
        startPage();
        List<Chuanshai> list = chuanshaiService.selectChuanshaiList(chuanshai);
        return getDataTable(list);
    }

    /**
     * 导出传染病筛选列表
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:chuanshai:export')")
    @Log(title = "传染病筛选", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Chuanshai chuanshai)
    {
        List<Chuanshai> list = chuanshaiService.selectChuanshaiList(chuanshai);
        ExcelUtil<Chuanshai> util = new ExcelUtil<Chuanshai>(Chuanshai.class);
        return util.exportExcel(list, "chuanshai");
    }

    /**
    * 导入传染病筛选列表
    */
    @PreAuthorize("@ss.hasPermi('healthrecords:chuanshai:import')")
    @PostMapping("/importData")
    @ResponseBody
    @Log(title = "传染病筛选", businessType = BusinessType.IMPORT)
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<Chuanshai> util = new ExcelUtil<Chuanshai>(Chuanshai.class);
        List<Chuanshai> list = util.importExcel(file.getInputStream());
        String message = chuanshaiService.importData(list, updateSupport);
        return AjaxResult.success(message);
    }

    @GetMapping("/importTemplate")
    public AjaxResult importTemplate()
    {
        ExcelUtil<Chuanshai> util = new ExcelUtil<Chuanshai>(Chuanshai.class);
        return util.importTemplateExcel("用户数据");
    }

    /**
     * 获取传染病筛选详细信息
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:chuanshai:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(chuanshaiService.selectChuanshaiById(id));
    }

    /**
     * 新增传染病筛选
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:chuanshai:add')")
    @Log(title = "传染病筛选", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Chuanshai chuanshai)
    {
        return toAjax(chuanshaiService.insertChuanshai(chuanshai));
    }

    /**
     * 修改传染病筛选
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:chuanshai:edit')")
    @Log(title = "传染病筛选", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Chuanshai chuanshai)
    {
        return toAjax(chuanshaiService.updateChuanshai(chuanshai));
    }

    /**
     * 删除传染病筛选
     */
    @PreAuthorize("@ss.hasPermi('healthrecords:chuanshai:remove')")
    @Log(title = "传染病筛选", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(chuanshaiService.deleteChuanshaiByIds(ids));
    }
}
