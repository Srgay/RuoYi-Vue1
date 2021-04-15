package com.ruoyi.healthrecords.service;

import java.util.List;
import com.ruoyi.healthrecords.domain.Chuanshai;

/**
 * 传染病筛选Service接口
 *
 * @author ry
 * @date 2020-10-29
 */
public interface IChuanshaiService
{
    /**
     * 查询传染病筛选
     *
     * @param id 传染病筛选ID
     * @return 传染病筛选
     */
    public Chuanshai selectChuanshaiById(Long id);

    /**
     * 查询传染病筛选列表
     *
     * @param chuanshai 传染病筛选
     * @return 传染病筛选集合
     */
    public List<Chuanshai> selectChuanshaiList(Chuanshai chuanshai);

    /**
     * 新增传染病筛选
     *
     * @param chuanshai 传染病筛选
     * @return 结果
     */
    public int insertChuanshai(Chuanshai chuanshai);

    /**
     * 修改传染病筛选
     *
     * @param chuanshai 传染病筛选
     * @return 结果
     */
    public int updateChuanshai(Chuanshai chuanshai);

    /**
     * 批量删除传染病筛选
     *
     * @param ids 需要删除的传染病筛选ID
     * @return 结果
     */
    public int deleteChuanshaiByIds(Long[] ids);

    /**
     * 删除传染病筛选信息
     *
     * @param id 传染病筛选ID
     * @return 结果
     */
    public int deleteChuanshaiById(Long id);
    /**
     * 导入传染病筛选
     *
     * @param
     * @return
     */
    public String importData(List<Chuanshai> list, boolean updateSupport);
}
