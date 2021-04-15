package com.ruoyi.yaochuru.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 药品出入库对象 yaochuru
 *
 * @author ry
 * @date 2020-10-29
 */
public class Yaochuru extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * 年月日
     */
    @Excel(name = "年月日")
    private String date;

    /** $column.columnComment */
   /* @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "年月日", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String time;
*/
    /**
     * 药品名称
     */
    @Excel(name = "药品名称")
    private String yname;

    /**
     * 单位
     */
    @Excel(name = "单位")
    private String company;

    /**
     * 数量
     */
    @Excel(name = "数量")
    private Long numbers;

    /**
     * 单价
     */
    @Excel(name = "单价")
    private Long price;

    /**
     * 总价
     */
    @Excel(name = "总价")
    private Long total;

    /**
     * 备注
     */
    @Excel(name = "备注")
    private String remakes;

    /**
     * 合计
     */
    @Excel(name = "合计")
    private Long allTotal;

    /**
     * 经办人
     */
    @Excel(name = "经办人")
    private String agent;

    /**
     * 审核人
     */
    @Excel(name = "审核人")
    private String reviewer;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    /* public void setTime(String time)
     {
         this.time = time;
     }

     public String getTime()
     {
         return time;
     }*/
    public void setYname(String yname) {
        this.yname = yname;
    }

    public String getYname() {
        return yname;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setNumbers(Long numbers) {
        this.numbers = numbers;
    }

    public Long getNumbers() {
        return numbers;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPrice() {
        return price;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotal() {
        return total;
    }

    public void setRemakes(String remakes) {
        this.remakes = remakes;
    }

    public String getRemakes() {
        return remakes;
    }

    public void setAllTotal(Long allTotal) {
        this.allTotal = allTotal;
    }

    public Long getAllTotal() {
        return allTotal;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getAgent() {
        return agent;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getReviewer() {
        return reviewer;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("date", getDate())
                //.append("time", getTime())
                .append("yname", getYname())
                .append("company", getCompany())
                .append("numbers", getNumbers())
                .append("price", getPrice())
                .append("total", getTotal())
                .append("remakes", getRemakes())
                .append("allTotal", getAllTotal())
                .append("agent", getAgent())
                .append("reviewer", getReviewer())
                .toString();
    }
}
