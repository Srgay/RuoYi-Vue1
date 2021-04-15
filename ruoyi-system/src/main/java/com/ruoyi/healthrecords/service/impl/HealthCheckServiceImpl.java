package com.ruoyi.healthrecords.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.healthrecords.mapper.HealthCheckMapper;
import com.ruoyi.healthrecords.domain.HealthCheck;
import com.ruoyi.healthrecords.service.IHealthCheckService;

/**
 * 定期健康状况Service业务层处理
 *
 * @author ry
 * @date 2020-10-29
 */
@Service
public class HealthCheckServiceImpl implements IHealthCheckService
{
    @Autowired
    private HealthCheckMapper healthCheckMapper;

    /**
     * 查询定期健康状况
     *
     * @param fileNum 定期健康状况ID
     * @return 定期健康状况
     */
    @Override
    public HealthCheck selectHealthCheckById(Long fileNum)
    {
        return healthCheckMapper.selectHealthCheckById(fileNum);
    }

    /**
     * 查询定期健康状况列表
     *
     * @param healthCheck 定期健康状况
     * @return 定期健康状况
     */
    @Override
    public List<HealthCheck> selectHealthCheckList(HealthCheck healthCheck)
    {
        return healthCheckMapper.selectHealthCheckList(healthCheck);
    }

    /**
     * 新增定期健康状况
     *
     * @param healthCheck 定期健康状况
     * @return 结果
     */
    @Override
    public int insertHealthCheck(HealthCheck healthCheck)
    {
        return healthCheckMapper.insertHealthCheck(healthCheck);
    }

    /**
     * 修改定期健康状况
     *
     * @param healthCheck 定期健康状况
     * @return 结果
     */
    @Override
    public int updateHealthCheck(HealthCheck healthCheck)
    {
        return healthCheckMapper.updateHealthCheck(healthCheck);
    }

    /**
     * 批量删除定期健康状况
     *
     * @param fileNums 需要删除的定期健康状况ID
     * @return 结果
     */
    @Override
    public int deleteHealthCheckByIds(Long[] fileNums)
    {
        return healthCheckMapper.deleteHealthCheckByIds(fileNums);
    }

    /**
     * 删除定期健康状况信息
     *
     * @param fileNum 定期健康状况ID
     * @return 结果
     */
    @Override
    public int deleteHealthCheckById(Long fileNum)
    {
        return healthCheckMapper.deleteHealthCheckById(fileNum);
    }

    /**
     * 导入定期健康状况
     *
     * @param
     * @return
     */
    @Override
    public String importData(List<HealthCheck> list, boolean updateSupport){
        list.stream().forEach(d->healthCheckMapper.insertHealthCheck(d));
        return "succeed";
    }
}
