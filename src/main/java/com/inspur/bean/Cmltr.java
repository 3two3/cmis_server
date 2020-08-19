package com.inspur.bean;

import java.math.BigDecimal;

public class Cmltr {
    private Integer cmKey;

    private String cmId;

    private String cmTdate;

    private String cmSub;

    private String cmTunit;

    private String cmStartdate;

    private String cmEnddate;

    private String cmKnow;

    private Integer cmCredit;

    private BigDecimal cmScore;

    private String cmAttachment;

    private String cmRemark;

    private String cmModificationDate;

    private String cmModificationPerson;

    private String cmRemarks;

    private String delFlag;

    public Integer getCmKey() {
        return cmKey;
    }

    public void setCmKey(Integer cmKey) {
        this.cmKey = cmKey;
    }

    public String getCmId() {
        return cmId;
    }

    public void setCmId(String cmId) {
        this.cmId = cmId == null ? null : cmId.trim();
    }

    public String getCmTdate() {
        return cmTdate;
    }

    public void setCmTdate(String cmTdate) {
        this.cmTdate = cmTdate == null ? null : cmTdate.trim();
    }

    public String getCmSub() {
        return cmSub;
    }

    public void setCmSub(String cmSub) {
        this.cmSub = cmSub == null ? null : cmSub.trim();
    }

    public String getCmTunit() {
        return cmTunit;
    }

    public void setCmTunit(String cmTunit) {
        this.cmTunit = cmTunit == null ? null : cmTunit.trim();
    }

    public String getCmStartdate() {
        return cmStartdate;
    }

    public void setCmStartdate(String cmStartdate) {
        this.cmStartdate = cmStartdate == null ? null : cmStartdate.trim();
    }

    public String getCmEnddate() {
        return cmEnddate;
    }

    public void setCmEnddate(String cmEnddate) {
        this.cmEnddate = cmEnddate == null ? null : cmEnddate.trim();
    }

    public String getCmKnow() {
        return cmKnow;
    }

    public void setCmKnow(String cmKnow) {
        this.cmKnow = cmKnow == null ? null : cmKnow.trim();
    }

    public Integer getCmCredit() {
        return cmCredit;
    }

    public void setCmCredit(Integer cmCredit) {
        this.cmCredit = cmCredit;
    }

    public BigDecimal getCmScore() {
        return cmScore;
    }

    public void setCmScore(BigDecimal cmScore) {
        this.cmScore = cmScore;
    }

    public String getCmAttachment() {
        return cmAttachment;
    }

    public void setCmAttachment(String cmAttachment) {
        this.cmAttachment = cmAttachment == null ? null : cmAttachment.trim();
    }

    public String getCmRemark() {
        return cmRemark;
    }

    public void setCmRemark(String cmRemark) {
        this.cmRemark = cmRemark == null ? null : cmRemark.trim();
    }

    public String getCmModificationDate() {
        return cmModificationDate;
    }

    public void setCmModificationDate(String cmModificationDate) {
        this.cmModificationDate = cmModificationDate == null ? null : cmModificationDate.trim();
    }

    public String getCmModificationPerson() {
        return cmModificationPerson;
    }

    public void setCmModificationPerson(String cmModificationPerson) {
        this.cmModificationPerson = cmModificationPerson == null ? null : cmModificationPerson.trim();
    }

    public String getCmRemarks() {
        return cmRemarks;
    }

    public void setCmRemarks(String cmRemarks) {
        this.cmRemarks = cmRemarks == null ? null : cmRemarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}