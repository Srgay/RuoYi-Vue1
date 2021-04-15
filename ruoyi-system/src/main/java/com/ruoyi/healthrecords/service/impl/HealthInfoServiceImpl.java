package com.ruoyi.healthrecords.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.healthrecords.mapper.HealthInfoMapper;
import com.ruoyi.healthrecords.domain.HealthInfo;
import com.ruoyi.healthrecords.service.IHealthInfoService;

/**
 * 戒毒情况Service业务层处理
 *
 * @author ry
 * @date 2020-10-29
 */
@Service
public class HealthInfoServiceImpl implements IHealthInfoService
{
    @Autowired
    private HealthInfoMapper healthInfoMapper;

    /**
     * 查询戒毒情况
     *
     * @param fileNum 戒毒情况ID
     * @return 戒毒情况
     */
    @Override
    public HealthInfo selectHealthInfoById(Long fileNum)
    {
        return healthInfoMapper.selectHealthInfoById(fileNum);
    }

    /**
     * 查询戒毒情况列表
     *
     * @param healthInfo 戒毒情况
     * @return 戒毒情况
     */
    @Override
    public List<HealthInfo> selectHealthInfoList(HealthInfo healthInfo)
    {
        return healthInfoMapper.selectHealthInfoList(healthInfo);
    }

    /**
     * 新增戒毒情况
     *
     * @param healthInfo 戒毒情况
     * @return 结果
     */
    @Override
    public int insertHealthInfo(HealthInfo healthInfo)
    {
        return healthInfoMapper.insertHealthInfo(healthInfo);
    }

    /**
     * 修改戒毒情况
     *
     * @param healthInfo 戒毒情况
     * @return 结果
     */
    @Override
    public int updateHealthInfo(HealthInfo healthInfo)
    {
        return healthInfoMapper.updateHealthInfo(healthInfo);
    }

    /**
     * 批量删除戒毒情况
     *
     * @param fileNums 需要删除的戒毒情况ID
     * @return 结果
     */
    @Override
    public int deleteHealthInfoByIds(Long[] fileNums)
    {
        return healthInfoMapper.deleteHealthInfoByIds(fileNums);
    }

    /**
     * 删除戒毒情况信息
     *
     * @param fileNum 戒毒情况ID
     * @return 结果
     */
    @Override
    public int deleteHealthInfoById(Long fileNum)
    {
        return healthInfoMapper.deleteHealthInfoById(fileNum);
    }

    /**
     * 导入戒毒情况
     *
     * @param
     * @return
     */
    public String importData(List<HealthInfo> list, boolean updateSupport){
        list.stream().forEach(d->healthInfoMapper.insertHealthInfo(d));
        return "succeed";
    }
}
