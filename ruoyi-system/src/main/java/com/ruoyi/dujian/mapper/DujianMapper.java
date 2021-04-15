package com.ruoyi.dujian.mapper;

import java.util.List;
import com.ruoyi.dujian.domain.Dujian;

/**
 * 毒品检查Mapper接口
 * 
 * @author ry
 * @date 2020-10-29
 */
public interface DujianMapper 
{
    /**
     * 查询毒品检查
     * 
     * @param id 毒品检查ID
     * @return 毒品检查
     */
    public Dujian selectDujianById(Long id);

    /**
     * 查询毒品检查列表
     * 
     * @param dujian 毒品检查
     * @return 毒品检查集合
     */
    public List<Dujian> selectDujianList(Dujian dujian);

    /**
     * 新增毒品检查
     * 
     * @param dujian 毒品检查
     * @return 结果
     */
    public int insertDujian(Dujian dujian);

    /**
     * 修改毒品检查
     * 
     * @param dujian 毒品检查
     * @return 结果
     */
    public int updateDujian(Dujian dujian);

    /**
     * 删除毒品检查
     * 
     * @param id 毒品检查ID
     * @return 结果
     */
    public int deleteDujianById(Long id);

    /**
     * 批量删除毒品检查
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDujianByIds(Long[] ids);
}
