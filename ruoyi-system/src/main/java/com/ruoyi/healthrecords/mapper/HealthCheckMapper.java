package com.ruoyi.healthrecords.mapper;

import java.util.List;
import com.ruoyi.healthrecords.domain.HealthCheck;

/**
 * 定期健康状况Mapper接口
 * 
 * @author ry
 * @date 2020-10-29
 */
public interface HealthCheckMapper 
{
    /**
     * 查询定期健康状况
     * 
     * @param fileNum 定期健康状况ID
     * @return 定期健康状况
     */
    public HealthCheck selectHealthCheckById(Long fileNum);

    /**
     * 查询定期健康状况列表
     * 
     * @param healthCheck 定期健康状况
     * @return 定期健康状况集合
     */
    public List<HealthCheck> selectHealthCheckList(HealthCheck healthCheck);

    /**
     * 新增定期健康状况
     * 
     * @param healthCheck 定期健康状况
     * @return 结果
     */
    public int insertHealthCheck(HealthCheck healthCheck);

    /**
     * 修改定期健康状况
     * 
     * @param healthCheck 定期健康状况
     * @return 结果
     */
    public int updateHealthCheck(HealthCheck healthCheck);

    /**
     * 删除定期健康状况
     * 
     * @param fileNum 定期健康状况ID
     * @return 结果
     */
    public int deleteHealthCheckById(Long fileNum);

    /**
     * 批量删除定期健康状况
     * 
     * @param fileNums 需要删除的数据ID
     * @return 结果
     */
    public int deleteHealthCheckByIds(Long[] fileNums);
}
