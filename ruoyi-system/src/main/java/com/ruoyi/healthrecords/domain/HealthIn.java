package com.ruoyi.healthrecords.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 入所健康状况对象 health_in
 *
 * @author ruoyi
 * @date 2020-10-25
 */
public class HealthIn extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 档案号 */
    @Excel(name = "档案号")
    private Long fileNum;

    /** 填表时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "填表时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private String fillingTime;

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

    /** 原居住地 */
    @Excel(name = "原居住地")
    private String formerResidence;

    /** 照片 */
    //@Excel(name = "照片")
    private String photo;

    /** 体表有无外伤及异常 */
    @Excel(name = "体表有无外伤及异常")
    private String injured;

    /** 身高 */
    @Excel(name = "身高")
    private String height;

    /** 体重 */
    @Excel(name = "体重")
    private String weight;

    /** 体温 */
    @Excel(name = "体温")
    private String temperature;

    /** 心率 */
    @Excel(name = "心率")
    private String heartRate;

    /** 血压 */
    @Excel(name = "血压")
    private String bloodPressure;

    /** 发育 */
    @Excel(name = "发育")
    private String developing;

    /** 营养 */
    @Excel(name = "营养")
    private String nutrition;

    /** 神志 */
    @Excel(name = "神志")
    private String mind;

    /** 言语 */
    @Excel(name = "言语")
    private String language;

    /** 应答 */
    @Excel(name = "应答")
    private String answer;

    /** 步态 */
    @Excel(name = "步态")
    private String gait;

    /** 面色 */
    @Excel(name = "面色")
    private String face;

    /** 皮肤粘膜 */
    @Excel(name = "皮肤粘膜")
    private String SkinMucous;

    /** 淋巴结 */
    @Excel(name = "淋巴结")
    private String lymphGland;

    /** 头面部 */
    @Excel(name = "头面部")
    private String headFace;

    /** 颈部 */
    @Excel(name = "颈部")
    private String neck;

    /** 扁桃体 */
    @Excel(name = "扁桃体")
    private String tonsil;

    /** 胸廓 */
    @Excel(name = "胸廓")
    private String chest;

    /** 心脏 */
    @Excel(name = "心脏")
    private String heart;

    /** 肺部 */
    @Excel(name = "肺部")
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

    /** 肛门 */
    @Excel(name = "肛门")
    private String anus;

    /** 听力 */
    @Excel(name = "听力")
    private String hearing;

    /** 瞳孔 */
    @Excel(name = "瞳孔")
    private String pupil;

    /** 视力 */
    @Excel(name = "视力")
    private String vision;

    /** 口腔溃疡 */
    @Excel(name = "口腔溃疡")
    private String mouthUlcer;

    /** 齿龈 */
    @Excel(name = "齿龈")
    private String gums;

    /** 龋齿 */
    @Excel(name = "龋齿")
    private String toothDecay;

    /** 牙齿脱落 */
    @Excel(name = "牙齿脱落")
    private String toothLoss;

    /** 化验 */
    @Excel(name = "化验")
    private String examination;

    /** 艾滋病检测 */
    @Excel(name = "艾滋病检测")
    private String aids;

    /** 心电图 */
    @Excel(name = "心电图")
    private String electrocardiogram;

    /** 性病检测 */
    @Excel(name = "性病检测")
    private String std;

    /** 放射 */
    @Excel(name = "放射")
    private String radiation;

    /** 尿液 */
    @Excel(name = "尿液")
    private String urine;

    /** 其他体检内容 */
    @Excel(name = "其他体检内容")
    private String other;

    /** 结论 */
    @Excel(name = "结论")
    private String conclusion;

    /** 身体状况评估 */
    @Excel(name = "身体状况评估")
    private String physicalCondition;

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
    public void setFillingTime(String fillingTime)
    {
        this.fillingTime = fillingTime;
    }

    public String getFillingTime()
    {
        return fillingTime;
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
    public void setFormerResidence(String formerResidence)
    {
        this.formerResidence = formerResidence;
    }

    public String getFormerResidence()
    {
        return formerResidence;
    }
    public void setPhoto(String photo)
    {
        this.photo = photo;
    }

    public String getPhoto()
    {
        return photo;
    }
    public void setInjured(String injured)
    {
        this.injured = injured;
    }

    public String getInjured()
    {
        return injured;
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
    public void setTemperature(String temperature)
    {
        this.temperature = temperature;
    }

    public String getTemperature()
    {
        return temperature;
    }
    public void setHeartRate(String heartRate)
    {
        this.heartRate = heartRate;
    }

    public String getHeartRate()
    {
        return heartRate;
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
    public void setNutrition(String nutrition)
    {
        this.nutrition = nutrition;
    }

    public String getNutrition()
    {
        return nutrition;
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
    public void setFace(String face)
    {
        this.face = face;
    }

    public String getFace()
    {
        return face;
    }
    public void setSkinMucous(String SkinMucous)
    {
        this.SkinMucous = SkinMucous;
    }

    public String getSkinMucous()
    {
        return SkinMucous;
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
    public void setTonsil(String tonsil)
    {
        this.tonsil = tonsil;
    }

    public String getTonsil()
    {
        return tonsil;
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
    public void setAnus(String anus)
    {
        this.anus = anus;
    }

    public String getAnus()
    {
        return anus;
    }
    public void setHearing(String hearing)
    {
        this.hearing = hearing;
    }

    public String getHearing()
    {
        return hearing;
    }
    public void setPupil(String pupil)
    {
        this.pupil = pupil;
    }

    public String getPupil()
    {
        return pupil;
    }
    public void setVision(String vision)
    {
        this.vision = vision;
    }

    public String getVision()
    {
        return vision;
    }
    public void setMouthUlcer(String mouthUlcer)
    {
        this.mouthUlcer = mouthUlcer;
    }

    public String getMouthUlcer()
    {
        return mouthUlcer;
    }
    public void setGums(String gums)
    {
        this.gums = gums;
    }

    public String getGums()
    {
        return gums;
    }
    public void setToothDecay(String toothDecay)
    {
        this.toothDecay = toothDecay;
    }

    public String getToothDecay()
    {
        return toothDecay;
    }
    public void setToothLoss(String toothLoss)
    {
        this.toothLoss = toothLoss;
    }

    public String getToothLoss()
    {
        return toothLoss;
    }
    public void setExamination(String examination)
    {
        this.examination = examination;
    }

    public String getExamination()
    {
        return examination;
    }
    public void setAids(String aids)
    {
        this.aids = aids;
    }

    public String getAids()
    {
        return aids;
    }
    public void setElectrocardiogram(String electrocardiogram)
    {
        this.electrocardiogram = electrocardiogram;
    }

    public String getElectrocardiogram()
    {
        return electrocardiogram;
    }
    public void setStd(String std)
    {
        this.std = std;
    }

    public String getStd()
    {
        return std;
    }
    public void setRadiation(String radiation)
    {
        this.radiation = radiation;
    }

    public String getRadiation()
    {
        return radiation;
    }
    public void setUrine(String urine)
    {
        this.urine = urine;
    }

    public String getUrine()
    {
        return urine;
    }
    public void setOther(String other)
    {
        this.other = other;
    }

    public String getOther()
    {
        return other;
    }
    public void setConclusion(String conclusion)
    {
        this.conclusion = conclusion;
    }

    public String getConclusion()
    {
        return conclusion;
    }
    public void setPhysicalCondition(String physicalCondition)
    {
        this.physicalCondition = physicalCondition;
    }

    public String getPhysicalCondition()
    {
        return physicalCondition;
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
            .append("fillingTime", getFillingTime())
            .append("name", getName())
            .append("age", getAge())
            .append("marriage", getMarriage())
            .append("educa", getEduca())
            .append("startTime", getStartTime())
            .append("endingTime", getEndingTime())
            .append("formerResidence", getFormerResidence())
            .append("photo", getPhoto())
            .append("injured", getInjured())
            .append("height", getHeight())
            .append("weight", getWeight())
            .append("temperature", getTemperature())
            .append("heartRate", getHeartRate())
            .append("bloodPressure", getBloodPressure())
            .append("developing", getDeveloping())
            .append("nutrition", getNutrition())
            .append("mind", getMind())
            .append("language", getLanguage())
            .append("answer", getAnswer())
            .append("gait", getGait())
            .append("face", getFace())
            .append("SkinMucous", getSkinMucous())
            .append("lymphGland", getLymphGland())
            .append("headFace", getHeadFace())
            .append("neck", getNeck())
            .append("tonsil", getTonsil())
            .append("chest", getChest())
            .append("heart", getHeart())
            .append("lung", getLung())
            .append("abdomen", getAbdomen())
            .append("spine", getSpine())
            .append("limb", getLimb())
            .append("nervousSystem", getNervousSystem())
            .append("anus", getAnus())
            .append("hearing", getHearing())
            .append("pupil", getPupil())
            .append("vision", getVision())
            .append("mouthUlcer", getMouthUlcer())
            .append("gums", getGums())
            .append("toothDecay", getToothDecay())
            .append("toothLoss", getToothLoss())
            .append("examination", getExamination())
            .append("aids", getAids())
            .append("electrocardiogram", getElectrocardiogram())
            .append("std", getStd())
            .append("radiation", getRadiation())
            .append("urine", getUrine())
            .append("other", getOther())
            .append("conclusion", getConclusion())
            .append("physicalCondition", getPhysicalCondition())
            .append("remarks", getRemarks())
            .toString();
    }
}
