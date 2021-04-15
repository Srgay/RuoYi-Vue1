package com.ruoyi.healthrecords.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 就诊记录对象 jiuzhen
 *
 * @author ry
 * @date 2020-10-29
 */
public class Jiuzhen extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 年月日 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "年月日", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String date;

    /** 时间 */
    /*@JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String time;*/

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 队别 */
    @Excel(name = "队别")
    private String duibie;

    /** 诊断结果 */
    @Excel(name = "诊断结果")
    private String diagnosisResults;

    /** 处方 */
    @Excel(name = "处方")
    private String prescription;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    /** 接诊医生 */
    @Excel(name = "接诊医生")
    private String attendingDoctor;

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
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setDuibie(String duibie)
    {
        this.duibie = duibie;
    }

    public String getDuibie()
    {
        return duibie;
    }
    public void setDiagnosisResults(String diagnosisResults)
    {
        this.diagnosisResults = diagnosisResults;
    }

    public String getDiagnosisResults()
    {
        return diagnosisResults;
    }
    public void setPrescription(String prescription)
    {
        this.prescription = prescription;
    }

    public String getPrescription()
    {
        return prescription;
    }
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    public String getRemarks()
    {
        return remarks;
    }
    public void setAttendingDoctor(String attendingDoctor)
    {
        this.attendingDoctor = attendingDoctor;
    }

    public String getAttendingDoctor()
    {
        return attendingDoctor;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("date", getDate())
            //.append("time", getTime())
            .append("name", getName())
            .append("duibie", getDuibie())
            .append("diagnosisResults", getDiagnosisResults())
            .append("prescription", getPrescription())
            .append("remarks", getRemarks())
            .append("attendingDoctor", getAttendingDoctor())
            .toString();
    }
}
