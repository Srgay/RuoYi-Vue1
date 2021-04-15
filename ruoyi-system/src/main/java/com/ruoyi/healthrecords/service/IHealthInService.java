package com.ruoyi.healthrecords.service;

import java.util.List;
import com.ruoyi.healthrecords.domain.HealthIn;

/**
 * 入所健康状况Service接口
 * 
 * @author ruoyi
 * @date 2020-10-25
 */
public interface IHealthInService 
{
    /**
     * 查询入所健康状况
     * 
     * @param id 入所健康状况ID
     * @return 入所健康状况
     */
    public HealthIn selectHealthInById(Long id);

    /**
     * 查询入所健康状况列表
     * 
     * @param healthIn 入所健康状况
     * @return 入所健康状况集合
     */
    public List<HealthIn> selectHealthInList(HealthIn healthIn);

    /**
     * 新增入所健康状况
     * 
     * @param healthIn 入所健康状况
     * @return 结果
     */
    public int insertHealthIn(HealthIn healthIn);

    /**
     * 修改入所健康状况
     * 
     * @param healthIn 入所健康状况
     * @return 结果
     */
    public int updateHealthIn(HealthIn healthIn);

    /**
     * 批量删除入所健康状况
     * 
     * @param ids 需要删除的入所健康状况ID
     * @return 结果
     */
    public int deleteHealthInByIds(Long[] ids);

    /**
     * 删除入所健康状况信息
     * 
     * @param id 入所健康状况ID
     * @return 结果
     */
    public int deleteHealthInById(Long id);

    String importData(List<HealthIn> list, boolean updateSupport);
}
