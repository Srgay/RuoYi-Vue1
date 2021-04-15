package com.ruoyi.healthrecords.service;

import java.util.List;
import com.ruoyi.healthrecords.domain.Waizhen;

/**
 * 外诊记录Service接口
 *
 * @author ruoyi
 * @date 2020-10-29
 */
public interface IWaizhenService
{
    /**
     * 查询外诊记录
     *
     * @param id 外诊记录ID
     * @return 外诊记录
     */
    public Waizhen selectWaizhenById(Long id);

    /**
     * 查询外诊记录列表
     *
     * @param waizhen 外诊记录
     * @return 外诊记录集合
     */
    public List<Waizhen> selectWaizhenList(Waizhen waizhen);

    /**
     * 新增外诊记录
     *
     * @param waizhen 外诊记录
     * @return 结果
     */
    public int insertWaizhen(Waizhen waizhen);

    /**
     * 修改外诊记录
     *
     * @param waizhen 外诊记录
     * @return 结果
     */
    public int updateWaizhen(Waizhen waizhen);

    /**
     * 批量删除外诊记录
     *
     * @param ids 需要删除的外诊记录ID
     * @return 结果
     */
    public int deleteWaizhenByIds(Long[] ids);

    /**
     * 删除外诊记录信息
     *
     * @param id 外诊记录ID
     * @return 结果
     */
    public int deleteWaizhenById(Long id);
    /**
     * 导入外诊记录
     *
     * @param
     * @return
     */
    public String importData(List<Waizhen> list, boolean updateSupport);
}
