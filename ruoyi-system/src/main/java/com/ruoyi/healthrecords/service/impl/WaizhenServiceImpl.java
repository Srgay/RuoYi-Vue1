package com.ruoyi.healthrecords.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.healthrecords.mapper.WaizhenMapper;
import com.ruoyi.healthrecords.domain.Waizhen;
import com.ruoyi.healthrecords.service.IWaizhenService;

/**
 * 外诊记录Service业务层处理
 *
 * @author ruoyi
 * @date 2020-10-29
 */
@Service
public class WaizhenServiceImpl implements IWaizhenService
{
    @Autowired
    private WaizhenMapper waizhenMapper;

    /**
     * 查询外诊记录
     *
     * @param id 外诊记录ID
     * @return 外诊记录
     */
    @Override
    public Waizhen selectWaizhenById(Long id)
    {
        return waizhenMapper.selectWaizhenById(id);
    }

    /**
     * 查询外诊记录列表
     *
     * @param waizhen 外诊记录
     * @return 外诊记录
     */
    @Override
    public List<Waizhen> selectWaizhenList(Waizhen waizhen)
    {
        return waizhenMapper.selectWaizhenList(waizhen);
    }

    /**
     * 新增外诊记录
     *
     * @param waizhen 外诊记录
     * @return 结果
     */
    @Override
    public int insertWaizhen(Waizhen waizhen)
    {
        return waizhenMapper.insertWaizhen(waizhen);
    }

    /**
     * 修改外诊记录
     *
     * @param waizhen 外诊记录
     * @return 结果
     */
    @Override
    public int updateWaizhen(Waizhen waizhen)
    {
        return waizhenMapper.updateWaizhen(waizhen);
    }

    /**
     * 批量删除外诊记录
     *
     * @param ids 需要删除的外诊记录ID
     * @return 结果
     */
    @Override
    public int deleteWaizhenByIds(Long[] ids)
    {
        return waizhenMapper.deleteWaizhenByIds(ids);
    }

    /**
     * 删除外诊记录信息
     *
     * @param id 外诊记录ID
     * @return 结果
     */
    @Override
    public int deleteWaizhenById(Long id)
    {
        return waizhenMapper.deleteWaizhenById(id);
    }

    /**
     * 导入外诊记录
     *
     * @param
     * @return
     */
    public String importData(List<Waizhen> list, boolean updateSupport){
        list.stream().forEach(d->waizhenMapper.insertWaizhen(d));
        return "succeed";
    }
}
