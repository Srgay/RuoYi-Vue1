package com.ruoyi.yaochuru.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.yaochuru.domain.Yaochuru;
import com.ruoyi.yaochuru.service.IYaochuruService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 药品出入库Controller
 *
 * @author ry
 * @date 2020-10-29
 */
@RestController
@RequestMapping("/yaochuru/yaochuru")
public class YaochuruController extends BaseController
{
    @Autowired
    private IYaochuruService yaochuruService;

    /**
     * 查询药品出入库列表
     */
    @PreAuthorize("@ss.hasPermi('yaochuru:yaochuru:list')")
    @GetMapping("/list")
    public TableDataInfo list(Yaochuru yaochuru)
    {
        startPage();
        List<Yaochuru> list = yaochuruService.selectYaochuruList(yaochuru);
        return getDataTable(list);
    }

    /**
     * 导出药品出入库列表
     */
    @PreAuthorize("@ss.hasPermi('yaochuru:yaochuru:export')")
    @Log(title = "药品出入库", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Yaochuru yaochuru)
    {
        List<Yaochuru> list = yaochuruService.selectYaochuruList(yaochuru);
        ExcelUtil<Yaochuru> util = new ExcelUtil<Yaochuru>(Yaochuru.class);
        return util.exportExcel(list, "yaochuru");
    }

    /**
    * 导入药品出入库列表
    */
    @PreAuthorize("@ss.hasPermi('yaochuru:yaochuru:import')")
    @PostMapping("/importData")
    @ResponseBody
    @Log(title = "药品出入库", businessType = BusinessType.IMPORT)
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<Yaochuru> util = new ExcelUtil<Yaochuru>(Yaochuru.class);
        List<Yaochuru> list = util.importExcel(file.getInputStream());
        String message = yaochuruService.importData(list, updateSupport);
        return AjaxResult.success(message);
    }

    @GetMapping("/importTemplate")
    public AjaxResult importTemplate()
    {
        ExcelUtil<Yaochuru> util = new ExcelUtil<Yaochuru>(Yaochuru.class);
        return util.importTemplateExcel("用户数据");
    }

    /**
     * 获取药品出入库详细信息
     */
    @PreAuthorize("@ss.hasPermi('yaochuru:yaochuru:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(yaochuruService.selectYaochuruById(id));
    }

    /**
     * 新增药品出入库
     */
    @PreAuthorize("@ss.hasPermi('yaochuru:yaochuru:add')")
    @Log(title = "药品出入库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Yaochuru yaochuru)
    {
        return toAjax(yaochuruService.insertYaochuru(yaochuru));
    }

    /**
     * 修改药品出入库
     */
    @PreAuthorize("@ss.hasPermi('yaochuru:yaochuru:edit')")
    @Log(title = "药品出入库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Yaochuru yaochuru)
    {
        return toAjax(yaochuruService.updateYaochuru(yaochuru));
    }

    /**
     * 删除药品出入库
     */
    @PreAuthorize("@ss.hasPermi('yaochuru:yaochuru:remove')")
    @Log(title = "药品出入库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(yaochuruService.deleteYaochuruByIds(ids));
    }
}
