package com.ruoyi.jiaopei.service;

import java.util.List;
import com.ruoyi.jiaopei.domain.Jiaopei;

/**
 * 教育培训Service接口
 *
 * @author ry
 * @date 2020-10-29
 */
public interface IJiaopeiService
{
    /**
     * 查询教育培训
     *
     * @param id 教育培训ID
     * @return 教育培训
     */
    public Jiaopei selectJiaopeiById(Long id);

    /**
     * 查询教育培训列表
     *
     * @param jiaopei 教育培训
     * @return 教育培训集合
     */
    public List<Jiaopei> selectJiaopeiList(Jiaopei jiaopei);

    /**
     * 新增教育培训
     *
     * @param jiaopei 教育培训
     * @return 结果
     */
    public int insertJiaopei(Jiaopei jiaopei);

    /**
     * 修改教育培训
     *
     * @param jiaopei 教育培训
     * @return 结果
     */
    public int updateJiaopei(Jiaopei jiaopei);

    /**
     * 批量删除教育培训
     *
     * @param ids 需要删除的教育培训ID
     * @return 结果
     */
    public int deleteJiaopeiByIds(Long[] ids);

    /**
     * 删除教育培训信息
     *
     * @param id 教育培训ID
     * @return 结果
     */
    public int deleteJiaopeiById(Long id);
    /**
     * 导入教育培训
     *
     * @param
     * @return
     */
    public String importData(List<Jiaopei> list, boolean updateSupport);
}
