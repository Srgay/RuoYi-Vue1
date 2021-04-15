package com.ruoyi.dujian.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.dujian.mapper.DujianMapper;
import com.ruoyi.dujian.domain.Dujian;
import com.ruoyi.dujian.service.IDujianService;

/**
 * 毒品检查Service业务层处理
 *
 * @author ry
 * @date 2020-10-29
 */
@Service
public class DujianServiceImpl implements IDujianService
{
    @Autowired
    private DujianMapper dujianMapper;

    /**
     * 查询毒品检查
     *
     * @param id 毒品检查ID
     * @return 毒品检查
     */
    @Override
    public Dujian selectDujianById(Long id)
    {
        return dujianMapper.selectDujianById(id);
    }

    /**
     * 查询毒品检查列表
     *
     * @param dujian 毒品检查
     * @return 毒品检查
     */
    @Override
    public List<Dujian> selectDujianList(Dujian dujian)
    {
        return dujianMapper.selectDujianList(dujian);
    }

    /**
     * 新增毒品检查
     *
     * @param dujian 毒品检查
     * @return 结果
     */
    @Override
    public int insertDujian(Dujian dujian)
    {
        return dujianMapper.insertDujian(dujian);
    }

    /**
     * 修改毒品检查
     *
     * @param dujian 毒品检查
     * @return 结果
     */
    @Override
    public int updateDujian(Dujian dujian)
    {
        return dujianMapper.updateDujian(dujian);
    }

    /**
     * 批量删除毒品检查
     *
     * @param ids 需要删除的毒品检查ID
     * @return 结果
     */
    @Override
    public int deleteDujianByIds(Long[] ids)
    {
        return dujianMapper.deleteDujianByIds(ids);
    }

    /**
     * 删除毒品检查信息
     *
     * @param id 毒品检查ID
     * @return 结果
     */
    @Override
    public int deleteDujianById(Long id)
    {
        return dujianMapper.deleteDujianById(id);
    }

    /**
     * 导入毒品检查
     *
     * @param
     * @return
     */
    public String importData(List<Dujian> list, boolean updateSupport){
        list.stream().forEach(d->dujianMapper.insertDujian(d));
        return "succeed";
    }
}
