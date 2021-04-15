package com.ruoyi.healthrecords.mapper;

import java.util.List;
import com.ruoyi.healthrecords.domain.Jiuzhen;

/**
 * 就诊记录Mapper接口
 * 
 * @author ry
 * @date 2020-10-29
 */
public interface JiuzhenMapper 
{
    /**
     * 查询就诊记录
     * 
     * @param id 就诊记录ID
     * @return 就诊记录
     */
    public Jiuzhen selectJiuzhenById(Long id);

    /**
     * 查询就诊记录列表
     * 
     * @param jiuzhen 就诊记录
     * @return 就诊记录集合
     */
    public List<Jiuzhen> selectJiuzhenList(Jiuzhen jiuzhen);

    /**
     * 新增就诊记录
     * 
     * @param jiuzhen 就诊记录
     * @return 结果
     */
    public int insertJiuzhen(Jiuzhen jiuzhen);

    /**
     * 修改就诊记录
     * 
     * @param jiuzhen 就诊记录
     * @return 结果
     */
    public int updateJiuzhen(Jiuzhen jiuzhen);

    /**
     * 删除就诊记录
     * 
     * @param id 就诊记录ID
     * @return 结果
     */
    public int deleteJiuzhenById(Long id);

    /**
     * 批量删除就诊记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJiuzhenByIds(Long[] ids);
}
