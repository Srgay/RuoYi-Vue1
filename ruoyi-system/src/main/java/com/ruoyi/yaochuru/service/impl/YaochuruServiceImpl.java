package com.ruoyi.yaochuru.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.yaochuru.mapper.YaochuruMapper;
import com.ruoyi.yaochuru.domain.Yaochuru;
import com.ruoyi.yaochuru.service.IYaochuruService;

/**
 * 药品出入库Service业务层处理
 *
 * @author ry
 * @date 2020-10-29
 */
@Service
public class YaochuruServiceImpl implements IYaochuruService
{
    @Autowired
    private YaochuruMapper yaochuruMapper;

    /**
     * 查询药品出入库
     *
     * @param id 药品出入库ID
     * @return 药品出入库
     */
    @Override
    public Yaochuru selectYaochuruById(Long id)
    {
        return yaochuruMapper.selectYaochuruById(id);
    }

    /**
     * 查询药品出入库列表
     *
     * @param yaochuru 药品出入库
     * @return 药品出入库
     */
    @Override
    public List<Yaochuru> selectYaochuruList(Yaochuru yaochuru)
    {
        return yaochuruMapper.selectYaochuruList(yaochuru);
    }

    /**
     * 新增药品出入库
     *
     * @param yaochuru 药品出入库
     * @return 结果
     */
    @Override
    public int insertYaochuru(Yaochuru yaochuru)
    {
        return yaochuruMapper.insertYaochuru(yaochuru);
    }

    /**
     * 修改药品出入库
     *
     * @param yaochuru 药品出入库
     * @return 结果
     */
    @Override
    public int updateYaochuru(Yaochuru yaochuru)
    {
        return yaochuruMapper.updateYaochuru(yaochuru);
    }

    /**
     * 批量删除药品出入库
     *
     * @param ids 需要删除的药品出入库ID
     * @return 结果
     */
    @Override
    public int deleteYaochuruByIds(Long[] ids)
    {
        return yaochuruMapper.deleteYaochuruByIds(ids);
    }

    /**
     * 删除药品出入库信息
     *
     * @param id 药品出入库ID
     * @return 结果
     */
    @Override
    public int deleteYaochuruById(Long id)
    {
        return yaochuruMapper.deleteYaochuruById(id);
    }

    /**
     * 导入药品出入库
     *
     * @param
     * @return
     */
    public String importData(List<Yaochuru> list, boolean updateSupport){
        list.stream().forEach(d->yaochuruMapper.insertYaochuru(d));
        return "succeed";
    }
}
