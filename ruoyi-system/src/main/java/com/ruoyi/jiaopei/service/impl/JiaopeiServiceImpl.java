package com.ruoyi.jiaopei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.jiaopei.mapper.JiaopeiMapper;
import com.ruoyi.jiaopei.domain.Jiaopei;
import com.ruoyi.jiaopei.service.IJiaopeiService;

/**
 * 教育培训Service业务层处理
 *
 * @author ry
 * @date 2020-10-29
 */
@Service
public class JiaopeiServiceImpl implements IJiaopeiService
{
    @Autowired
    private JiaopeiMapper jiaopeiMapper;

    /**
     * 查询教育培训
     *
     * @param id 教育培训ID
     * @return 教育培训
     */
    @Override
    public Jiaopei selectJiaopeiById(Long id)
    {
        return jiaopeiMapper.selectJiaopeiById(id);
    }

    /**
     * 查询教育培训列表
     *
     * @param jiaopei 教育培训
     * @return 教育培训
     */
    @Override
    public List<Jiaopei> selectJiaopeiList(Jiaopei jiaopei)
    {
        return jiaopeiMapper.selectJiaopeiList(jiaopei);
    }

    /**
     * 新增教育培训
     *
     * @param jiaopei 教育培训
     * @return 结果
     */
    @Override
    public int insertJiaopei(Jiaopei jiaopei)
    {
        return jiaopeiMapper.insertJiaopei(jiaopei);
    }

    /**
     * 修改教育培训
     *
     * @param jiaopei 教育培训
     * @return 结果
     */
    @Override
    public int updateJiaopei(Jiaopei jiaopei)
    {
        return jiaopeiMapper.updateJiaopei(jiaopei);
    }

    /**
     * 批量删除教育培训
     *
     * @param ids 需要删除的教育培训ID
     * @return 结果
     */
    @Override
    public int deleteJiaopeiByIds(Long[] ids)
    {
        return jiaopeiMapper.deleteJiaopeiByIds(ids);
    }

    /**
     * 删除教育培训信息
     *
     * @param id 教育培训ID
     * @return 结果
     */
    @Override
    public int deleteJiaopeiById(Long id)
    {
        return jiaopeiMapper.deleteJiaopeiById(id);
    }

    /**
     * 导入教育培训
     *
     * @param
     * @return
     */
    public String importData(List<Jiaopei> list, boolean updateSupport){
        list.stream().forEach(d->jiaopeiMapper.insertJiaopei(d));
        return "succeed";
    }
}
