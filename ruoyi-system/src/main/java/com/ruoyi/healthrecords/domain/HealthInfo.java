package com.ruoyi.healthrecords.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 戒毒情况对象 health_info
 *
 * @author ry
 * @date 2020-10-29
 */
public class HealthInfo extends BaseEntity
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

    /** 合成药物 */
    @Excel(name = "合成药物")
    private String syntheticDrugs;

    /** 毒品来源 */
    @Excel(name = "毒品来源")
    private String drugFrom;

    /** 使用方法 */
    @Excel(name = "使用方法")
    private String usageMethod;

    /** 是否共用注射器 */
    @Excel(name = "是否共用注射器")
    private String gyzhusheqi;

    /** 首次吸毒时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "首次吸毒时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String firstDrugTime;

    /** 成瘾时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "成瘾时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String addictionTime;

    /** 末次吸毒时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "末次吸毒时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String lastDrugTime;

    /** 平均每日用量 */
    @Excel(name = "平均每日用量")
    private String dailyUse;

    /** 使用毒品后的主观感受 */
    @Excel(name = "使用毒品后的主观感受")
    private String subMind;

    /** 使用毒品以来精神及行为的改变 */
    @Excel(name = "使用毒品以来精神及行为的改变")
    private String mindChange;

    /** 戒毒症状 */
    @Excel(name = "戒毒症状")
    private String symptom;

    /** 戒毒次数 */
    @Excel(name = "戒毒次数")
    private String symptomTimes;

    /** 何处戒毒 */
    @Excel(name = "何处戒毒")
    private String whereDet;

    /** 复吸时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "复吸时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String relapseTime;

    /** 吸食方法 */
    @Excel(name = "吸食方法")
    private String relapseWay;

    /** 复吸原因 */
    @Excel(name = "复吸原因")
    private String relapseReason;

    /** 既往病史 */
    @Excel(name = "既往病史")
    private String medicalHistory;

    /** 治疗措施 */
    @Excel(name = "治疗措施")
    private String treatment;

    /** 有无治愈 */
    @Excel(name = "有无治愈")
    private String cureOrnot;

    /** 近期有无吞食异物 */
    @Excel(name = "近期有无吞食异物")
    private String swallowOrnot;

    /** 异物类型 */
    @Excel(name = "异物类型")
    private String swallowType;

    /** 既往有无外伤、受伤情况 */
    @Excel(name = "既往有无外伤、受伤情况")
    private String injureOrnot;

    /** 皮肤有无瘢痕 */
    @Excel(name = "皮肤有无瘢痕")
    private String scarOrnot;

    /** 有无手术 */
    @Excel(name = "有无手术")
    private String operationOrnot;

    /** 有无家族精神病史 */
    @Excel(name = "有无家族精神病史")
    private String mentalillnessOrnot;

    /** 何种疾病 */
    @Excel(name = "何种疾病")
    private String diseaseType;

    /** 有无纹身 */
    @Excel(name = "有无纹身")
    private String tattooOrnot;

    /** 纹身位置 */
    @Excel(name = "纹身位置")
    private String tattooPosition;

    /** 其他补充内容 */
    @Excel(name = "其他补充内容")
    private String supplement;

    /** 主要抚养者 */
    @Excel(name = "主要抚养者")
    private String foster;

    /** 在校学习成绩 */
    @Excel(name = "在校学习成绩")
    private String grade;

    /** 性格 */
    @Excel(name = "性格")
    private String character;

    /** 生活特殊嗜好 */
    @Excel(name = "生活特殊嗜好")
    private String hobby;

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
    public void setSyntheticDrugs(String syntheticDrugs)
    {
        this.syntheticDrugs = syntheticDrugs;
    }

    public String getSyntheticDrugs()
    {
        return syntheticDrugs;
    }
    public void setDrugFrom(String drugFrom)
    {
        this.drugFrom = drugFrom;
    }

    public String getDrugFrom()
    {
        return drugFrom;
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
    public void setFirstDrugTime(String firstDrugTime)
    {
        this.firstDrugTime = firstDrugTime;
    }

    public String getFirstDrugTime()
    {
        return firstDrugTime;
    }
    public void setAddictionTime(String addictionTime)
    {
        this.addictionTime = addictionTime;
    }

    public String getAddictionTime()
    {
        return addictionTime;
    }
    public void setLastDrugTime(String lastDrugTime)
    {
        this.lastDrugTime = lastDrugTime;
    }

    public String getLastDrugTime()
    {
        return lastDrugTime;
    }
    public void setDailyUse(String dailyUse)
    {
        this.dailyUse = dailyUse;
    }

    public String getDailyUse()
    {
        return dailyUse;
    }
    public void setSubMind(String subMind)
    {
        this.subMind = subMind;
    }

    public String getSubMind()
    {
        return subMind;
    }
    public void setMindChange(String mindChange)
    {
        this.mindChange = mindChange;
    }

    public String getMindChange()
    {
        return mindChange;
    }
    public void setSymptom(String symptom)
    {
        this.symptom = symptom;
    }

    public String getSymptom()
    {
        return symptom;
    }
    public void setSymptomTimes(String symptomTimes)
    {
        this.symptomTimes = symptomTimes;
    }

    public String getSymptomTimes()
    {
        return symptomTimes;
    }
    public void setWhereDet(String whereDet)
    {
        this.whereDet = whereDet;
    }

    public String getWhereDet()
    {
        return whereDet;
    }
    public void setRelapseTime(String relapseTime)
    {
        this.relapseTime = relapseTime;
    }

    public String getRelapseTime()
    {
        return relapseTime;
    }
    public void setRelapseWay(String relapseWay)
    {
        this.relapseWay = relapseWay;
    }

    public String getRelapseWay()
    {
        return relapseWay;
    }
    public void setRelapseReason(String relapseReason)
    {
        this.relapseReason = relapseReason;
    }

    public String getRelapseReason()
    {
        return relapseReason;
    }
    public void setMedicalHistory(String medicalHistory)
    {
        this.medicalHistory = medicalHistory;
    }

    public String getMedicalHistory()
    {
        return medicalHistory;
    }
    public void setTreatment(String treatment)
    {
        this.treatment = treatment;
    }

    public String getTreatment()
    {
        return treatment;
    }
    public void setCureOrnot(String cureOrnot)
    {
        this.cureOrnot = cureOrnot;
    }

    public String getCureOrnot()
    {
        return cureOrnot;
    }
    public void setSwallowOrnot(String swallowOrnot)
    {
        this.swallowOrnot = swallowOrnot;
    }

    public String getSwallowOrnot()
    {
        return swallowOrnot;
    }
    public void setSwallowType(String swallowType)
    {
        this.swallowType = swallowType;
    }

    public String getSwallowType()
    {
        return swallowType;
    }
    public void setInjureOrnot(String injureOrnot)
    {
        this.injureOrnot = injureOrnot;
    }

    public String getInjureOrnot()
    {
        return injureOrnot;
    }
    public void setScarOrnot(String scarOrnot)
    {
        this.scarOrnot = scarOrnot;
    }

    public String getScarOrnot()
    {
        return scarOrnot;
    }
    public void setOperationOrnot(String operationOrnot)
    {
        this.operationOrnot = operationOrnot;
    }

    public String getOperationOrnot()
    {
        return operationOrnot;
    }
    public void setMentalillnessOrnot(String mentalillnessOrnot)
    {
        this.mentalillnessOrnot = mentalillnessOrnot;
    }

    public String getMentalillnessOrnot()
    {
        return mentalillnessOrnot;
    }
    public void setDiseaseType(String diseaseType)
    {
        this.diseaseType = diseaseType;
    }

    public String getDiseaseType()
    {
        return diseaseType;
    }
    public void setTattooOrnot(String tattooOrnot)
    {
        this.tattooOrnot = tattooOrnot;
    }

    public String getTattooOrnot()
    {
        return tattooOrnot;
    }
    public void setTattooPosition(String tattooPosition)
    {
        this.tattooPosition = tattooPosition;
    }

    public String getTattooPosition()
    {
        return tattooPosition;
    }
    public void setSupplement(String supplement)
    {
        this.supplement = supplement;
    }

    public String getSupplement()
    {
        return supplement;
    }
    public void setFoster(String foster)
    {
        this.foster = foster;
    }

    public String getFoster()
    {
        return foster;
    }
    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public String getGrade()
    {
        return grade;
    }
    public void setCharacter(String character)
    {
        this.character = character;
    }

    public String getCharacter()
    {
        return character;
    }
    public void setHobby(String hobby)
    {
        this.hobby = hobby;
    }

    public String getHobby()
    {
        return hobby;
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
            .append("formerResidence", getFormerResidence())
            .append("race", getRace())
            .append("firstReason", getFirstReason())
            .append("drugType", getDrugType())
            .append("syntheticDrugs", getSyntheticDrugs())
            .append("drugFrom", getDrugFrom())
            .append("usageMethod", getUsageMethod())
            .append("gyzhusheqi", getGyzhusheqi())
            .append("firstDrugTime", getFirstDrugTime())
            .append("addictionTime", getAddictionTime())
            .append("lastDrugTime", getLastDrugTime())
            .append("dailyUse", getDailyUse())
            .append("subMind", getSubMind())
            .append("mindChange", getMindChange())
            .append("symptom", getSymptom())
            .append("symptomTimes", getSymptomTimes())
            .append("whereDet", getWhereDet())
            .append("relapseTime", getRelapseTime())
            .append("relapseWay", getRelapseWay())
            .append("relapseReason", getRelapseReason())
            .append("medicalHistory", getMedicalHistory())
            .append("treatment", getTreatment())
            .append("cureOrnot", getCureOrnot())
            .append("swallowOrnot", getSwallowOrnot())
            .append("swallowType", getSwallowType())
            .append("injureOrnot", getInjureOrnot())
            .append("scarOrnot", getScarOrnot())
            .append("operationOrnot", getOperationOrnot())
            .append("mentalillnessOrnot", getMentalillnessOrnot())
            .append("diseaseType", getDiseaseType())
            .append("tattooOrnot", getTattooOrnot())
            .append("tattooPosition", getTattooPosition())
            .append("supplement", getSupplement())
            .append("foster", getFoster())
            .append("grade", getGrade())
            .append("character", getCharacter())
            .append("hobby", getHobby())
            .append("remarks", getRemarks())
            .toString();
    }
}
