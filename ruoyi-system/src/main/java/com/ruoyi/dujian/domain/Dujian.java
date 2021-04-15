package com.ruoyi.dujian.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 毒品检查对象 dujian
 *
 * @author ry
 * @date 2020-10-29
 */
public class Dujian extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 测试试纸及板卡名称 */
    @Excel(name = "测试试纸及板卡名称")
    private String cname;

    /** 年月日 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "年月日", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String date;

    /** 序号 */
    @Excel(name = "序号")
    private Long num;

    /** 时间 */
    /*@JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String time;*/

    /** 队别 */
    @Excel(name = "队别")
    private String duibie;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 检测结果 */
    @Excel(name = "检测结果")
    private String results;

    /** 备注 */
    @Excel(name = "备注")
    private String remakes;

    /** 检验医师 */
    @Excel(name = "检验医师")
    private String yishi;

    /** 责任警察 */
    @Excel(name = "责任警察")
    private String jingcha;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setCname(String cname)
    {
        this.cname = cname;
    }

    public String getCname()
    {
        return cname;
    }
    public void setDate(String date)
    {
        this.date = date;
    }

    public String getDate()
    {
        return date;
    }
    public void setNum(Long num)
    {
        this.num = num;
    }

    public Long getNum()
    {
        return num;
    }
    /*public void setTime(String time)
    {
        this.time = time;
    }

    public String getTime()
    {
        return time;
    }*/
    public void setDuibie(String duibie)
    {
        this.duibie = duibie;
    }

    public String getDuibie()
    {
        return duibie;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setResults(String results)
    {
        this.results = results;
    }

    public String getResults()
    {
        return results;
    }
    public void setRemakes(String remakes)
    {
        this.remakes = remakes;
    }

    public String getRemakes()
    {
        return remakes;
    }
    public void setYishi(String yishi)
    {
        this.yishi = yishi;
    }

    public String getYishi()
    {
        return yishi;
    }
    public void setJingcha(String jingcha)
    {
        this.jingcha = jingcha;
    }

    public String getJingcha()
    {
        return jingcha;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cname", getCname())
            .append("date", getDate())
            .append("num", getNum())
            //.append("time", getTime())
            .append("duibie", getDuibie())
            .append("name", getName())
            .append("results", getResults())
            .append("remakes", getRemakes())
            .append("yishi", getYishi())
            .append("jingcha", getJingcha())
            .toString();
    }
}
