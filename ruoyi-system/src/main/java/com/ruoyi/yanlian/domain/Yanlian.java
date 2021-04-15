package com.ruoyi.yanlian.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 应急演练对象 yanlian
 *
 * @author ry
 * @date 2020-10-29
 */
public class Yanlian extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
     @Excel(name = "日期", readConverterExp = "$column.readConverterExp()")
    private String date;

    /** 时间 */
    /*@JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String time;*/

    /** 地点 */
    @Excel(name = "地点")
    private String part;

    /** 演习预案 */
    @Excel(name = "演习预案")
    private String yanxiyuan;

    /** 指挥长 */
    @Excel(name = "指挥长")
    private String commanderChief;

    /** 参加人员 */
    @Excel(name = "参加人员")
    private String participants;

    /** 记录 */
    @Excel(name = "记录")
    private String record;

    /** 演习情况及讲评 */
    @Excel(name = "演习情况及讲评")
    private String situation;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setDate(String date)
    {
        this.date = date;
    }

    public String getDate()
    {
        return date;
    }
    /*public void setTime(String time)
    {
        this.time = time;
    }

    public String getTime()
    {
        return time;
    }*/
    public void setPart(String part)
    {
        this.part = part;
    }

    public String getPart()
    {
        return part;
    }
    public void setYanxiyuan(String yanxiyuan)
    {
        this.yanxiyuan = yanxiyuan;
    }

    public String getYanxiyuan()
    {
        return yanxiyuan;
    }
    public void setCommanderChief(String commanderChief)
    {
        this.commanderChief = commanderChief;
    }

    public String getCommanderChief()
    {
        return commanderChief;
    }
    public void setParticipants(String participants)
    {
        this.participants = participants;
    }

    public String getParticipants()
    {
        return participants;
    }
    public void setRecord(String record)
    {
        this.record = record;
    }

    public String getRecord()
    {
        return record;
    }
    public void setSituation(String situation)
    {
        this.situation = situation;
    }

    public String getSituation()
    {
        return situation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("date", getDate())
            //.append("time", getTime())
            .append("part", getPart())
            .append("yanxiyuan", getYanxiyuan())
            .append("commanderChief", getCommanderChief())
            .append("participants", getParticipants())
            .append("record", getRecord())
            .append("situation", getSituation())
            .toString();
    }
}
