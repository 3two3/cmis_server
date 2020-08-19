package com.inspur.bean;

public class CmarketingRecord {
    private Integer cKey;

    private String cCmId;

    private String cName;

    private String cManagement;

    private String cDemand;

    private String cReport;

    private String cTestimonials;

    private String cEvaluation;

    private String cDate;

    private String cId;

    private String cRemarks;

    private String delFlag;

    public Integer getcKey() {
        return cKey;
    }

    public void setcKey(Integer cKey) {
        this.cKey = cKey;
    }

    public String getcCmId() {
        return cCmId;
    }

    public void setcCmId(String cCmId) {
        this.cCmId = cCmId == null ? null : cCmId.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcManagement() {
        return cManagement;
    }

    public void setcManagement(String cManagement) {
        this.cManagement = cManagement == null ? null : cManagement.trim();
    }

    public String getcDemand() {
        return cDemand;
    }

    public void setcDemand(String cDemand) {
        this.cDemand = cDemand == null ? null : cDemand.trim();
    }

    public String getcReport() {
        return cReport;
    }

    public void setcReport(String cReport) {
        this.cReport = cReport == null ? null : cReport.trim();
    }

    public String getcTestimonials() {
        return cTestimonials;
    }

    public void setcTestimonials(String cTestimonials) {
        this.cTestimonials = cTestimonials == null ? null : cTestimonials.trim();
    }

    public String getcEvaluation() {
        return cEvaluation;
    }

    public void setcEvaluation(String cEvaluation) {
        this.cEvaluation = cEvaluation == null ? null : cEvaluation.trim();
    }

    public String getcDate() {
        return cDate;
    }

    public void setcDate(String cDate) {
        this.cDate = cDate == null ? null : cDate.trim();
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcRemarks() {
        return cRemarks;
    }

    public void setcRemarks(String cRemarks) {
        this.cRemarks = cRemarks == null ? null : cRemarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}