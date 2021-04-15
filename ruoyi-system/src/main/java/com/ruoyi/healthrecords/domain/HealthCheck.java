package com.ruoyi.healthrecords.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 定期健康状况对象 health_check
 *
 * @author ry
 * @date 2020-10-29
 */
public class HealthCheck extends BaseEntity
{
    private static final long serialVersionUID = 1L;

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
    private String education;

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

    /** 吸食毒品种类 */
    @Excel(name = "吸食毒品种类")
    private String drugKind;

    /** 原居住地 */
    @Excel(name = "原居住地")
    private String formerResidence;

    /** 入所后曾患何种疾病及治疗情况 */
    @Excel(name = "入所后曾患何种疾病及治疗情况")
    private String treatment;

    /** 身高 */
    @Excel(name = "身高")
    private String height;

    /** 体重 */
    @Excel(name = "体重")
    private String weight;

    /** 血压 */
    @Excel(name = "血压")
    private String bloodPressure;

    /** 发育 */
    @Excel(name = "发育")
    private String developing;

    /** 神智 */
    @Excel(name = "神智")
    private String mind;

    /** 语言 */
    @Excel(name = "语言")
    private String language;

    /** 应答 */
    @Excel(name = "应答")
    private String answer;

    /** 步态 */
    @Excel(name = "步态")
    private String gait;

    /** 皮肤粘膜 */
    @Excel(name = "皮肤粘膜")
    private String skinMucous;

    /** 淋巴结 */
    @Excel(name = "淋巴结")
    private String lymphGland;

    /** 头面部 */
    @Excel(name = "头面部")
    private String headFace;

    /** 颈部 */
    @Excel(name = "颈部")
    private String neck;

    /** 胸廓 */
    @Excel(name = "胸廓")
    private String chest;

    /** 心脏 */
    @Excel(name = "心脏")
    private String heart;

    /** 肺 */
    @Excel(name = "肺")
    private String lung;

    /** 腹部 */
    @Excel(name = "腹部")
    private String abdomen;

    /** 脊柱 */
    @Excel(name = "脊柱")
    private String spine;

    /** 四肢 */
    @Excel(name = "四肢")
    private String limb;

    /** 神经系统 */
    @Excel(name = "神经系统")
    private String nervousSystem;

    /** 视力 */
    @Excel(name = "视力")
    private String vision;

    /** 听力 */
    @Excel(name = "听力")
    private String hearing;

    /** 龋齿 */
    @Excel(name = "龋齿")
    private String dentalCaries;

    /** 脱落 */
    @Excel(name = "脱落")
    private String fallOff;

    /** 其他体检内容 */
    @Excel(name = "其他体检内容")
    private String otherPe;

    /** 结论 */
    @Excel(name = "结论")
    private String conclusion;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

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
    public void setEducation(String education)
    {
        this.education = education;
    }

    public String getEducation()
    {
        return education;
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
    public void setDrugKind(String drugKind)
    {
        this.drugKind = drugKind;
    }

    public String getDrugKind()
    {
        return drugKind;
    }
    public void setFormerResidence(String formerResidence)
    {
        this.formerResidence = formerResidence;
    }

    public String getFormerResidence()
    {
        return formerResidence;
    }
    public void setTreatment(String treatment)
    {
        this.treatment = treatment;
    }

    public String getTreatment()
    {
        return treatment;
    }
    public void setHeight(String height)
    {
        this.height = height;
    }

    public String getHeight()
    {
        return height;
    }
    public void setWeight(String weight)
    {
        this.weight = weight;
    }

    public String getWeight()
    {
        return weight;
    }
    public void setBloodPressure(String bloodPressure)
    {
        this.bloodPressure = bloodPressure;
    }

    public String getBloodPressure()
    {
        return bloodPressure;
    }
    public void setDeveloping(String developing)
    {
        this.developing = developing;
    }

    public String getDeveloping()
    {
        return developing;
    }
    public void setMind(String mind)
    {
        this.mind = mind;
    }

    public String getMind()
    {
        return mind;
    }
    public void setLanguage(String language)
    {
        this.language = language;
    }

    public String getLanguage()
    {
        return language;
    }
    public void setAnswer(String answer)
    {
        this.answer = answer;
    }

    public String getAnswer()
    {
        return answer;
    }
    public void setGait(String gait)
    {
        this.gait = gait;
    }

    public String getGait()
    {
        return gait;
    }
    public void setSkinMucous(String skinMucous)
    {
        this.skinMucous = skinMucous;
    }

    public String getSkinMucous()
    {
        return skinMucous;
    }
    public void setLymphGland(String lymphGland)
    {
        this.lymphGland = lymphGland;
    }

    public String getLymphGland()
    {
        return lymphGland;
    }
    public void setHeadFace(String headFace)
    {
        this.headFace = headFace;
    }

    public String getHeadFace()
    {
        return headFace;
    }
    public void setNeck(String neck)
    {
        this.neck = neck;
    }

    public String getNeck()
    {
        return neck;
    }
    public void setChest(String chest)
    {
        this.chest = chest;
    }

    public String getChest()
    {
        return chest;
    }
    public void setHeart(String heart)
    {
        this.heart = heart;
    }

    public String getHeart()
    {
        return heart;
    }
    public void setLung(String lung)
    {
        this.lung = lung;
    }

    public String getLung()
    {
        return lung;
    }
    public void setAbdomen(String abdomen)
    {
        this.abdomen = abdomen;
    }

    public String getAbdomen()
    {
        return abdomen;
    }
    public void setSpine(String spine)
    {
        this.spine = spine;
    }

    public String getSpine()
    {
        return spine;
    }
    public void setLimb(String limb)
    {
        this.limb = limb;
    }

    public String getLimb()
    {
        return limb;
    }
    public void setNervousSystem(String nervousSystem)
    {
        this.nervousSystem = nervousSystem;
    }

    public String getNervousSystem()
    {
        return nervousSystem;
    }
    public void setVision(String vision)
    {
        this.vision = vision;
    }

    public String getVision()
    {
        return vision;
    }
    public void setHearing(String hearing)
    {
        this.hearing = hearing;
    }

    public String getHearing()
    {
        return hearing;
    }
    public void setDentalCaries(String dentalCaries)
    {
        this.dentalCaries = dentalCaries;
    }

    public String getDentalCaries()
    {
        return dentalCaries;
    }
    public void setFallOff(String fallOff)
    {
        this.fallOff = fallOff;
    }

    public String getFallOff()
    {
        return fallOff;
    }
    public void setOtherPe(String otherPe)
    {
        this.otherPe = otherPe;
    }

    public String getOtherPe()
    {
        return otherPe;
    }
    public void setConclusion(String conclusion)
    {
        this.conclusion = conclusion;
    }

    public String getConclusion()
    {
        return conclusion;
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
            .append("fileNum", getFileNum())
            .append("name", getName())
            .append("age", getAge())
            .append("marriage", getMarriage())
            .append("education", getEducation())
            .append("startTime", getStartTime())
            .append("endingTime", getEndingTime())
            .append("enterTime", getEnterTime())
            .append("drugKind", getDrugKind())
            .append("formerResidence", getFormerResidence())
            .append("treatment", getTreatment())
            .append("height", getHeight())
            .append("weight", getWeight())
            .append("bloodPressure", getBloodPressure())
            .append("developing", getDeveloping())
            .append("mind", getMind())
            .append("language", getLanguage())
            .append("answer", getAnswer())
            .append("gait", getGait())
            .append("skinMucous", getSkinMucous())
            .append("lymphGland", getLymphGland())
            .append("headFace", getHeadFace())
            .append("neck", getNeck())
            .append("chest", getChest())
            .append("heart", getHeart())
            .append("lung", getLung())
            .append("abdomen", getAbdomen())
            .append("spine", getSpine())
            .append("limb", getLimb())
            .append("nervousSystem", getNervousSystem())
            .append("vision", getVision())
            .append("hearing", getHearing())
            .append("dentalCaries", getDentalCaries())
            .append("fallOff", getFallOff())
            .append("otherPe", getOtherPe())
            .append("conclusion", getConclusion())
            .append("remarks", getRemarks())
            .toString();
    }
}
