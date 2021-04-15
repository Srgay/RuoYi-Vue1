package com.ruoyi.yaochuru.mapper;

import java.util.List;
import com.ruoyi.yaochuru.domain.Yaochuru;

/**
 * 药品出入库Mapper接口
 * 
 * @author ry
 * @date 2020-10-29
 */
public interface YaochuruMapper 
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
     * 删除药品出入库
     * 
     * @param id 药品出入库ID
     * @return 结果
     */
    public int deleteYaochuruById(Long id);

    /**
     * 批量删除药品出入库
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteYaochuruByIds(Long[] ids);
}
