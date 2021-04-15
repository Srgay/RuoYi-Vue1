package com.ruoyi.healthrecords.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 传染病筛选对象 chuanshai
 *
 * @author ry
 * @date 2020-10-29
 */
public class Chuanshai extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 档案号 */
    @Excel(name = "档案号")
    private Long fileNum;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long age;

    /** 婚否 */
    @Excel(name = "婚否")
    private String marriage;

    /** 文化程度 */
    @Excel(name = "文化程度")
    private String educa;

    /** 强制隔离戒毒开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "强制隔离戒毒开始日期", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String startTime;

    /** 强制隔离戒毒结束日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "强制隔离戒毒结束日期", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String endingTime;

    /** 入所时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "入所时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String enterTime;

    /** 原居住地 */
    @Excel(name = "原居住地")
    private String formerResidence;

    /** 民族 */
    @Excel(name = "民族")
    private String race;

    /** 首次吸毒原因 */
    @Excel(name = "首次吸毒原因")
    private String firstReason;

    /** 毒品种类 */
    @Excel(name = "毒品种类")
    private String drugType;

    /** 使用方法 */
    @Excel(name = "使用方法")
    private String usageMethod;

    /** 是否共用注射器 */
    @Excel(name = "是否共用注射器")
    private String gyzhusheqi;

    /** 乙肝筛查 */
    @Excel(name = "乙肝筛查")
    private String bScreening;

    /** 丙肝筛查 */
    @Excel(name = "丙肝筛查")
    private String cScreening;

    /** 性病筛查 */
    @Excel(name = "性病筛查")
    private String stdScreening;

    /** 艾滋病筛查 */
    @Excel(name = "艾滋病筛查")
    private String aidsScreening;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setFileNum(Long fileNum)
    {
        this.fileNum = fileNum;
    }

    public Long getFileNum()
    {
        return fileNum;
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
    public void setMarriage(String marriage)
    {
        this.marriage = marriage;
    }

    public String getMarriage()
    {
        return marriage;
    }
    public void setEduca(String educa)
    {
        this.educa = educa;
    }

    public String getEduca()
    {
        return educa;
    }
    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public String getStartTime()
    {
        return startTime;
    }
    public void setEndingTime(String endingTime)
    {
        this.endingTime = endingTime;
    }

    public String getEndingTime()
    {
        return endingTime;
    }
    public void setEnterTime(String enterTime)
    {
        this.enterTime = enterTime;
    }

    public String getEnterTime()
    {
        return enterTime;
    }
    public void setFormerResidence(String formerResidence)
    {
        this.formerResidence = formerResidence;
    }

    public String getFormerResidence()
    {
        return formerResidence;
    }
    public void setRace(String race)
    {
        this.race = race;
    }

    public String getRace()
    {
        return race;
    }
    public void setFirstReason(String firstReason)
    {
        this.firstReason = firstReason;
    }

    public String getFirstReason()
    {
        return firstReason;
    }
    public void setDrugType(String drugType)
    {
        this.drugType = drugType;
    }

    public String getDrugType()
    {
        return drugType;
    }
    public void setUsageMethod(String usageMethod)
    {
        this.usageMethod = usageMethod;
    }

    public String getUsageMethod()
    {
        return usageMethod;
    }
    public void setGyzhusheqi(String gyzhusheqi)
    {
        this.gyzhusheqi = gyzhusheqi;
    }

    public String getGyzhusheqi()
    {
        return gyzhusheqi;
    }
    public void setbScreening(String bScreening)
    {
        this.bScreening = bScreening;
    }

    public String getbScreening()
    {
        return bScreening;
    }
    public void setcScreening(String cScreening)
    {
        this.cScreening = cScreening;
    }

    public String getcScreening()
    {
        return cScreening;
    }
    public void setStdScreening(String stdScreening)
    {
        this.stdScreening = stdScreening;
    }

    public String getStdScreening()
    {
        return stdScreening;
    }
    public void setAidsScreening(String aidsScreening)
    {
        this.aidsScreening = aidsScreening;
    }

    public String getAidsScreening()
    {
        return aidsScreening;
    }
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    public String getRemarks()
    {
        return remarks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fileNum", getFileNum())
            .append("name", getName())
            .append("age", getAge())
            .append("marriage", getMarriage())
            .append("educa", getEduca())
            .append("startTime", getStartTime())
            .append("endingTime", getEndingTime())
            .append("enterTime", getEnterTime())
            .append("formerResidence", getFormerResidence())
            .append("race", getRace())
            .append("firstReason", getFirstReason())
            .append("drugType", getDrugType())
            .append("usageMethod", getUsageMethod())
            .append("gyzhusheqi", getGyzhusheqi())
            .append("bScreening", getbScreening())
            .append("cScreening", getcScreening())
            .append("stdScreening", getStdScreening())
            .append("aidsScreening", getAidsScreening())
            .append("remarks", getRemarks())
            .toString();
    }
}
