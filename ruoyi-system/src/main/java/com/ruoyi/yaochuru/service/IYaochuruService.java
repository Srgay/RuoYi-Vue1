package com.ruoyi.yaochuru.service;

import java.util.List;
import com.ruoyi.yaochuru.domain.Yaochuru;

/**
 * 药品出入库Service接口
 *
 * @author ry
 * @date 2020-10-29
 */
public interface IYaochuruService
{
    /**
     * 查询药品出入库
     *
     * @param id 药品出入库ID
     * @return 药品出入库
     */
    public Yaochuru selectYaochuruById(Long id);

    /**
     * 查询药品出入库列表
     *
     * @param yaochuru 药品出入库
     * @return 药品出入库集合
     */
    public List<Yaochuru> selectYaochuruList(Yaochuru yaochuru);

    /**
     * 新增药品出入库
     *
     * @param yaochuru 药品出入库
     * @return 结果
     */
    public int insertYaochuru(Yaochuru yaochuru);

    /**
     * 修改药品出入库
     *
     * @param yaochuru 药品出入库
     * @return 结果
     */
    public int updateYaochuru(Yaochuru yaochuru);

    /**
     * 批量删除药品出入库
     *
     * @param ids 需要删除的药品出入库ID
     * @return 结果
     */
    public int deleteYaochuruByIds(Long[] ids);

    /**
     * 删除药品出入库信息
     *
     * @param id 药品出入库ID
     * @return 结果
     */
    public int deleteYaochuruById(Long id);
    /**
     * 导入药品出入库
     *
     * @param
     * @return
     */
    public String importData(List<Yaochuru> list, boolean updateSupport);
}
