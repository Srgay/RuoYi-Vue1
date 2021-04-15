package com.ruoyi.healthrecords.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.healthrecords.mapper.JiuzhenMapper;
import com.ruoyi.healthrecords.domain.Jiuzhen;
import com.ruoyi.healthrecords.service.IJiuzhenService;

/**
 * 就诊记录Service业务层处理
 *
 * @author ry
 * @date 2020-10-29
 */
@Service
public class JiuzhenServiceImpl implements IJiuzhenService
{
    @Autowired
    private JiuzhenMapper jiuzhenMapper;

    /**
     * 查询就诊记录
     *
     * @param id 就诊记录ID
     * @return 就诊记录
     */
    @Override
    public Jiuzhen selectJiuzhenById(Long id)
    {
        return jiuzhenMapper.selectJiuzhenById(id);
    }

    /**
     * 查询就诊记录列表
     *
     * @param jiuzhen 就诊记录
     * @return 就诊记录
     */
    @Override
    public List<Jiuzhen> selectJiuzhenList(Jiuzhen jiuzhen)
    {
        return jiuzhenMapper.selectJiuzhenList(jiuzhen);
    }

    /**
     * 新增就诊记录
     *
     * @param jiuzhen 就诊记录
     * @return 结果
     */
    @Override
    public int insertJiuzhen(Jiuzhen jiuzhen)
    {
        return jiuzhenMapper.insertJiuzhen(jiuzhen);
    }

    /**
     * 修改就诊记录
     *
     * @param jiuzhen 就诊记录
     * @return 结果
     */
    @Override
    public int updateJiuzhen(Jiuzhen jiuzhen)
    {
        return jiuzhenMapper.updateJiuzhen(jiuzhen);
    }

    /**
     * 批量删除就诊记录
     *
     * @param ids 需要删除的就诊记录ID
     * @return 结果
     */
    @Override
    public int deleteJiuzhenByIds(Long[] ids)
    {
        return jiuzhenMapper.deleteJiuzhenByIds(ids);
    }

    /**
     * 删除就诊记录信息
     *
     * @param id 就诊记录ID
     * @return 结果
     */
    @Override
    public int deleteJiuzhenById(Long id)
    {
        return jiuzhenMapper.deleteJiuzhenById(id);
    }

    /**
     * 导入就诊记录
     *
     * @param
     * @return
     */
    public String importData(List<Jiuzhen> list, boolean updateSupport){
        list.stream().forEach(d->jiuzhenMapper.insertJiuzhen(d));
        return "succeed";
    }
}
