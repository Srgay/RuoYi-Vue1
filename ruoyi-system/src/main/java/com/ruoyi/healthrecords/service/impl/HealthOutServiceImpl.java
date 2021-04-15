package com.ruoyi.healthrecords.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.healthrecords.mapper.HealthOutMapper;
import com.ruoyi.healthrecords.domain.HealthOut;
import com.ruoyi.healthrecords.service.IHealthOutService;

/**
 * 出所健康状况Service业务层处理
 *
 * @author ruoyi
 * @date 2020-10-29
 */
@Service
public class HealthOutServiceImpl implements IHealthOutService
{
    @Autowired
    private HealthOutMapper healthOutMapper;

    /**
     * 查询出所健康状况
     *
     * @param id 出所健康状况ID
     * @return 出所健康状况
     */
    @Override
    public HealthOut selectHealthOutById(Long id)
    {
        return healthOutMapper.selectHealthOutById(id);
    }

    /**
     * 查询出所健康状况列表
     *
     * @param healthOut 出所健康状况
     * @return 出所健康状况
     */
    @Override
    public List<HealthOut> selectHealthOutList(HealthOut healthOut)
    {
        return healthOutMapper.selectHealthOutList(healthOut);
    }

    /**
     * 新增出所健康状况
     *
     * @param healthOut 出所健康状况
     * @return 结果
     */
    @Override
    public int insertHealthOut(HealthOut healthOut)
    {
        return healthOutMapper.insertHealthOut(healthOut);
    }

    /**
     * 修改出所健康状况
     *
     * @param healthOut 出所健康状况
     * @return 结果
     */
    @Override
    public int updateHealthOut(HealthOut healthOut)
    {
        return healthOutMapper.updateHealthOut(healthOut);
    }

    /**
     * 批量删除出所健康状况
     *
     * @param ids 需要删除的出所健康状况ID
     * @return 结果
     */
    @Override
    public int deleteHealthOutByIds(Long[] ids)
    {
        return healthOutMapper.deleteHealthOutByIds(ids);
    }

    /**
     * 删除出所健康状况信息
     *
     * @param id 出所健康状况ID
     * @return 结果
     */
    @Override
    public int deleteHealthOutById(Long id)
    {
        return healthOutMapper.deleteHealthOutById(id);
    }

    /**
     * 导入出所健康状况
     *
     * @param
     * @return
     */
    public String importData(List<HealthOut> list, boolean updateSupport){
        list.stream().forEach(d->healthOutMapper.insertHealthOut(d));
        return "succeed";
    }
}
