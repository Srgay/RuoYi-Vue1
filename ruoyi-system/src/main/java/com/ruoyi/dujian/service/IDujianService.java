package com.ruoyi.dujian.service;

import java.util.List;
import com.ruoyi.dujian.domain.Dujian;

/**
 * 毒品检查Service接口
 *
 * @author ry
 * @date 2020-10-29
 */
public interface IDujianService
{
    /**
     * 查询毒品检查
     *
     * @param id 毒品检查ID
     * @return 毒品检查
     */
    public Dujian selectDujianById(Long id);

    /**
     * 查询毒品检查列表
     *
     * @param dujian 毒品检查
     * @return 毒品检查集合
     */
    public List<Dujian> selectDujianList(Dujian dujian);

    /**
     * 新增毒品检查
     *
     * @param dujian 毒品检查
     * @return 结果
     */
    public int insertDujian(Dujian dujian);

    /**
     * 修改毒品检查
     *
     * @param dujian 毒品检查
     * @return 结果
     */
    public int updateDujian(Dujian dujian);

    /**
     * 批量删除毒品检查
     *
     * @param ids 需要删除的毒品检查ID
     * @return 结果
     */
    public int deleteDujianByIds(Long[] ids);

    /**
     * 删除毒品检查信息
     *
     * @param id 毒品检查ID
     * @return 结果
     */
    public int deleteDujianById(Long id);
    /**
     * 导入毒品检查
     *
     * @param
     * @return
     */
    public String importData(List<Dujian> list, boolean updateSupport);
}
