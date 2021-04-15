package com.ruoyi.healthrecords.service.impl;

import java.util.List;

import com.ruoyi.healthrecords.domain.HealthCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.healthrecords.mapper.HealthInMapper;
import com.ruoyi.healthrecords.domain.HealthIn;
import com.ruoyi.healthrecords.service.IHealthInService;

/**
 * 入所健康状况Service业务层处理
 *
 * @author ruoyi
 * @date 2020-10-25
 */
@Service
public class HealthInServiceImpl implements IHealthInService
{
    @Autowired
    private HealthInMapper healthInMapper;

    /**
     * 查询入所健康状况
     *
     * @param id 入所健康状况ID
     * @return 入所健康状况
     */
    @Override
    public HealthIn selectHealthInById(Long id)
    {
        return healthInMapper.selectHealthInById(id);
    }

    /**
     * 查询入所健康状况列表
     *
     * @param healthIn 入所健康状况
     * @return 入所健康状况
     */
    @Override
    public List<HealthIn> selectHealthInList(HealthIn healthIn)
    {
        return healthInMapper.selectHealthInList(healthIn);
    }

    /**
     * 新增入所健康状况
     *
     * @param healthIn 入所健康状况
     * @return 结果
     */
    @Override
    public int insertHealthIn(HealthIn healthIn)
    {
        return healthInMapper.insertHealthIn(healthIn);
    }

    /**
     * 修改入所健康状况
     *
     * @param healthIn 入所健康状况
     * @return 结果
     */
    @Override
    public int updateHealthIn(HealthIn healthIn)
    {
        return healthInMapper.updateHealthIn(healthIn);
    }

    /**
     * 批量删除入所健康状况
     *
     * @param ids 需要删除的入所健康状况ID
     * @return 结果
     */
    @Override
    public int deleteHealthInByIds(Long[] ids)
    {
        return healthInMapper.deleteHealthInByIds(ids);
    }

    /**
     * 删除入所健康状况信息
     *
     * @param id 入所健康状况ID
     * @return 结果
     */
    @Override
    public int deleteHealthInById(Long id)
    {
        return healthInMapper.deleteHealthInById(id);
    }
    /**
     * 导入入所健康状况
     *
     * @param
     * @return
     */
    @Override
    public String importData(List<HealthIn> list, boolean updateSupport){
        list.stream().forEach(d->healthInMapper.insertHealthIn(d));
        return "succeed";
    }
}
