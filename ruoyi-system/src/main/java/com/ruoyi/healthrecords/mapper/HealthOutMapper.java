package com.ruoyi.healthrecords.mapper;

import java.util.List;
import com.ruoyi.healthrecords.domain.HealthOut;

/**
 * 出所健康状况Mapper接口
 * 
 * @author ruoyi
 * @date 2020-10-29
 */
public interface HealthOutMapper 
{
    /**
     * 查询出所健康状况
     * 
     * @param id 出所健康状况ID
     * @return 出所健康状况
     */
    public HealthOut selectHealthOutById(Long id);

    /**
     * 查询出所健康状况列表
     * 
     * @param healthOut 出所健康状况
     * @return 出所健康状况集合
     */
    public List<HealthOut> selectHealthOutList(HealthOut healthOut);

    /**
     * 新增出所健康状况
     * 
     * @param healthOut 出所健康状况
     * @return 结果
     */
    public int insertHealthOut(HealthOut healthOut);

    /**
     * 修改出所健康状况
     * 
     * @param healthOut 出所健康状况
     * @return 结果
     */
    public int updateHealthOut(HealthOut healthOut);

    /**
     * 删除出所健康状况
     * 
     * @param id 出所健康状况ID
     * @return 结果
     */
    public int deleteHealthOutById(Long id);

    /**
     * 批量删除出所健康状况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteHealthOutByIds(Long[] ids);
}
