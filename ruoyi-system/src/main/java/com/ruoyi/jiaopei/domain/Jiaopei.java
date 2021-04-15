package com.ruoyi.jiaopei.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教育培训对象 jiaopei
 *
 * @author ry
 * @date 2020-10-29
 */
public class Jiaopei extends BaseEntity
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

    /** 参加人员 */
    @Excel(name = "参加人员")
    private String participants;

    /** 主办单位 */
    @Excel(name = "主办单位")
    private String organizer;

    /** 培训主题培训主题 */
    @Excel(name = "培训主题培训主题")
    private String trainingTopics;

    /** 记录 */
    @Excel(name = "记录")
    private String record;

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
    public void setParticipants(String participants)
    {
        this.participants = participants;
    }

    public String getParticipants()
    {
        return participants;
    }
    public void setOrganizer(String organizer)
    {
        this.organizer = organizer;
    }

    public String getOrganizer()
    {
        return organizer;
    }
    public void setTrainingTopics(String trainingTopics)
    {
        this.trainingTopics = trainingTopics;
    }

    public String getTrainingTopics()
    {
        return trainingTopics;
    }
    public void setRecord(String record)
    {
        this.record = record;
    }

    public String getRecord()
    {
        return record;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("date", getDate())
            //.append("time", getTime())
            .append("part", getPart())
            .append("participants", getParticipants())
            .append("organizer", getOrganizer())
            .append("trainingTopics", getTrainingTopics())
            .append("record", getRecord())
            .toString();
    }
}
