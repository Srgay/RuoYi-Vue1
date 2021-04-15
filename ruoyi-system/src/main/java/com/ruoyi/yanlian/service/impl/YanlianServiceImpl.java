package com.ruoyi.yanlian.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.yanlian.mapper.YanlianMapper;
import com.ruoyi.yanlian.domain.Yanlian;
import com.ruoyi.yanlian.service.IYanlianService;

/**
 * 应急演练Service业务层处理
 *
 * @author ry
 * @date 2020-10-29
 */
@Service
public class YanlianServiceImpl implements IYanlianService
{
    @Autowired
    private YanlianMapper yanlianMapper;

    /**
     * 查询应急演练
     *
     * @param id 应急演练ID
     * @return 应急演练
     */
    @Override
    public Yanlian selectYanlianById(Long id)
    {
        return yanlianMapper.selectYanlianById(id);
    }

    /**
     * 查询应急演练列表
     *
     * @param yanlian 应急演练
     * @return 应急演练
     */
    @Override
    public List<Yanlian> selectYanlianList(Yanlian yanlian)
    {
        return yanlianMapper.selectYanlianList(yanlian);
    }

    /**
     * 新增应急演练
     *
     * @param yanlian 应急演练
     * @return 结果
     */
    @Override
    public int insertYanlian(Yanlian yanlian)
    {
        return yanlianMapper.insertYanlian(yanlian);
    }

    /**
     * 修改应急演练
     *
     * @param yanlian 应急演练
     * @return 结果
     */
    @Override
    public int updateYanlian(Yanlian yanlian)
    {
        return yanlianMapper.updateYanlian(yanlian);
    }

    /**
     * 批量删除应急演练
     *
     * @param ids 需要删除的应急演练ID
     * @return 结果
     */
    @Override
    public int deleteYanlianByIds(Long[] ids)
    {
        return yanlianMapper.deleteYanlianByIds(ids);
    }

    /**
     * 删除应急演练信息
     *
     * @param id 应急演练ID
     * @return 结果
     */
    @Override
    public int deleteYanlianById(Long id)
    {
        return yanlianMapper.deleteYanlianById(id);
    }

    /**
     * 导入应急演练
     *
     * @param
     * @return
     */
    public String importData(List<Yanlian> list, boolean updateSupport){
        list.stream().forEach(d->yanlianMapper.insertYanlian(d));
        return "succeed";
    }
}
