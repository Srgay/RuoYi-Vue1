package com.ruoyi.healthrecords.service;

import java.util.List;
import com.ruoyi.healthrecords.domain.HealthInfo;

/**
 * 戒毒情况Service接口
 *
 * @author ry
 * @date 2020-10-29
 */
public interface IHealthInfoService
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
     * 批量删除戒毒情况
     *
     * @param fileNums 需要删除的戒毒情况ID
     * @return 结果
     */
    public int deleteHealthInfoByIds(Long[] fileNums);

    /**
     * 删除戒毒情况信息
     *
     * @param fileNum 戒毒情况ID
     * @return 结果
     */
    public int deleteHealthInfoById(Long fileNum);
    /**
     * 导入戒毒情况
     *
     * @param
     * @return
     */
    public String importData(List<HealthInfo> list, boolean updateSupport);
}
