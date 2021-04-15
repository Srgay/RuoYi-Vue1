package com.ruoyi.healthrecords.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 外诊记录对象 waizhen
 *
 * @author ruoyi
 * @date 2020-10-29
 */
public class Waizhen extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 编号 */
    @Excel(name = "编号")
    private Long num;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String date;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long age;

    /** 民族 */
    @Excel(name = "民族")
    private String race;

    /** 队别 */
    @Excel(name = "队别")
    private String duibie;

    /** 外诊原因 */
    @Excel(name = "外诊原因")
    private String wzReason;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setNum(Long num)
    {
        this.num = num;
    }

    public Long getNum()
    {
        return num;
    }
    public void setDate(String date)
    {
        this.date = date;
    }

    public String getDate()
    {
        return date;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setAge(Long age)
    {
        this.age = age;
    }

    public Long getAge()
    {
        return age;
    }
    public void setRace(String race)
    {
        this.race = race;
    }

    public String getRace()
    {
        return race;
    }
    public void setDuibie(String duibie)
    {
        this.duibie = duibie;
    }

    public String getDuibie()
    {
        return duibie;
    }
    public void setWzReason(String wzReason)
    {
        this.wzReason = wzReason;
    }

    public String getWzReason()
    {
        return wzReason;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("num", getNum())
            .append("date", getDate())
            .append("name", getName())
            .append("age", getAge())
            .append("race", getRace())
            .append("duibie", getDuibie())
            .append("wzReason", getWzReason())
            .toString();
    }
}
