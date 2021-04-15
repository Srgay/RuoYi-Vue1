package com.ruoyi.yanlian.mapper;

import java.util.List;
import com.ruoyi.yanlian.domain.Yanlian;

/**
 * 应急演练Mapper接口
 * 
 * @author ry
 * @date 2020-10-29
 */
public interface YanlianMapper 
{
    /**
     * 查询应急演练
     * 
     * @param id 应急演练ID
     * @return 应急演练
     */
    public Yanlian selectYanlianById(Long id);

    /**
     * 查询应急演练列表
     * 
     * @param yanlian 应急演练
     * @return 应急演练集合
     */
    public List<Yanlian> selectYanlianList(Yanlian yanlian);

    /**
     * 新增应急演练
     * 
     * @param yanlian 应急演练
     * @return 结果
     */
    public int insertYanlian(Yanlian yanlian);

    /**
     * 修改应急演练
     * 
     * @param yanlian 应急演练
     * @return 结果
     */
    public int updateYanlian(Yanlian yanlian);

    /**
     * 删除应急演练
     * 
     * @param id 应急演练ID
     * @return 结果
     */
    public int deleteYanlianById(Long id);

    /**
     * 批量删除应急演练
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteYanlianByIds(Long[] ids);
}
