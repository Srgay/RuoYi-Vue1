package com.ruoyi.healthrecords.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.healthrecords.mapper.ChuanshaiMapper;
import com.ruoyi.healthrecords.domain.Chuanshai;
import com.ruoyi.healthrecords.service.IChuanshaiService;

/**
 * 传染病筛选Service业务层处理
 *
 * @author ry
 * @date 2020-10-29
 */
@Service
public class ChuanshaiServiceImpl implements IChuanshaiService
{
    @Autowired
    private ChuanshaiMapper chuanshaiMapper;

    /**
     * 查询传染病筛选
     *
     * @param id 传染病筛选ID
     * @return 传染病筛选
     */
    @Override
    public Chuanshai selectChuanshaiById(Long id)
    {
        return chuanshaiMapper.selectChuanshaiById(id);
    }

    /**
     * 查询传染病筛选列表
     *
     * @param chuanshai 传染病筛选
     * @return 传染病筛选
     */
    @Override
    public List<Chuanshai> selectChuanshaiList(Chuanshai chuanshai)
    {
        return chuanshaiMapper.selectChuanshaiList(chuanshai);
    }

    /**
     * 新增传染病筛选
     *
     * @param chuanshai 传染病筛选
     * @return 结果
     */
    @Override
    public int insertChuanshai(Chuanshai chuanshai)
    {
        return chuanshaiMapper.insertChuanshai(chuanshai);
    }

    /**
     * 修改传染病筛选
     *
     * @param chuanshai 传染病筛选
     * @return 结果
     */
    @Override
    public int updateChuanshai(Chuanshai chuanshai)
    {
        return chuanshaiMapper.updateChuanshai(chuanshai);
    }

    /**
     * 批量删除传染病筛选
     *
     * @param ids 需要删除的传染病筛选ID
     * @return 结果
     */
    @Override
    public int deleteChuanshaiByIds(Long[] ids)
    {
        return chuanshaiMapper.deleteChuanshaiByIds(ids);
    }

    /**
     * 删除传染病筛选信息
     *
     * @param id 传染病筛选ID
     * @return 结果
     */
    @Override
    public int deleteChuanshaiById(Long id)
    {
        return chuanshaiMapper.deleteChuanshaiById(id);
    }

    /**
     * 导入传染病筛选
     *
     * @param
     * @return
     */
    public String importData(List<Chuanshai> list, boolean updateSupport){
        list.stream().forEach(d->chuanshaiMapper.insertChuanshai(d));
        return "succeed";
    }
}
