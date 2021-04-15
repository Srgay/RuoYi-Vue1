package com.ruoyi.healthrecords.mapper;

import java.util.List;
import com.ruoyi.healthrecords.domain.HealthInfo;

/**
 * 戒毒情况Mapper接口
 * 
 * @author ry
 * @date 2020-10-29
 */
public interface HealthInfoMapper 
{
    /**
     * 查询戒毒情况
     * 
     * @param fileNum 戒毒情况ID
     * @return 戒毒情况
     */
    public HealthInfo selectHealthInfoById(Long fileNum);

    /**
     * 查询戒毒情况列表
     * 
     * @param healthInfo 戒毒情况
     * @return 戒毒情况集合
     */
    public List<HealthInfo> selectHealthInfoList(HealthInfo healthInfo);

    /**
     * 新增戒毒情况
     * 
     * @param healthInfo 戒毒情况
     * @return 结果
     */
    public int insertHealthInfo(HealthInfo healthInfo);

    /**
     * 修改戒毒情况
     * 
     * @param healthInfo 戒毒情况
     * @return 结果
     */
    public int updateHealthInfo(HealthInfo healthInfo);

    /**
     * 删除戒毒情况
     * 
     * @param fileNum 戒毒情况ID
     * @return 结果
     */
    public int deleteHealthInfoById(Long fileNum);

    /**
     * 批量删除戒毒情况
     * 
     * @param fileNums 需要删除的数据ID
     * @return 结果
     */
    public int deleteHealthInfoByIds(Long[] fileNums);
}
