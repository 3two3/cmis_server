package com.inspur.bean;

public class Cmass {
    private Integer cmKey;

    private Integer cmId;

    private String cmAsstime;

    private String cmAssub;

    private String cmAssperiod;

    private String cmAssresult;

    private String cmAppraisal;

    private String cmAssunit;

    private String cmRemark;

    private String cmAttachment;

    private String cmModificationPerson;

    private String cmModificationDate;

    private String cmRemarks;

    private String delFlag;

    public Integer getCmKey() {
        return cmKey;
    }

    public void setCmKey(Integer cmKey) {
        this.cmKey = cmKey;
    }

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public String getCmAsstime() {
        return cmAsstime;
    }

    public void setCmAsstime(String cmAsstime) {
        this.cmAsstime = cmAsstime == null ? null : cmAsstime.trim();
    }

    public String getCmAssub() {
        return cmAssub;
    }

    public void setCmAssub(String cmAssub) {
        this.cmAssub = cmAssub == null ? null : cmAssub.trim();
    }

    public String getCmAssperiod() {
        return cmAssperiod;
    }

    public void setCmAssperiod(String cmAssperiod) {
        this.cmAssperiod = cmAssperiod == null ? null : cmAssperiod.trim();
    }

    public String getCmAssresult() {
        return cmAssresult;
    }

    public void setCmAssresult(String cmAssresult) {
        this.cmAssresult = cmAssresult == null ? null : cmAssresult.trim();
    }

    public String getCmAppraisal() {
        return cmAppraisal;
    }

    public void setCmAppraisal(String cmAppraisal) {
        this.cmAppraisal = cmAppraisal == null ? null : cmAppraisal.trim();
    }

    public String getCmAssunit() {
        return cmAssunit;
    }

    public void setCmAssunit(String cmAssunit) {
        this.cmAssunit = cmAssunit == null ? null : cmAssunit.trim();
    }

    public String getCmRemark() {
        return cmRemark;
    }

    public void setCmRemark(String cmRemark) {
        this.cmRemark = cmRemark == null ? null : cmRemark.trim();
    }

    public String getCmAttachment() {
        return cmAttachment;
    }

    public void setCmAttachment(String cmAttachment) {
        this.cmAttachment = cmAttachment == null ? null : cmAttachment.trim();
    }

    public String getCmModificationPerson() {
        return cmModificationPerson;
    }

    public void setCmModificationPerson(String cmModificationPerson) {
        this.cmModificationPerson = cmModificationPerson == null ? null : cmModificationPerson.trim();
    }

    public String getCmModificationDate() {
        return cmModificationDate;
    }

    public void setCmModificationDate(String cmModificationDate) {
        this.cmModificationDate = cmModificationDate == null ? null : cmModificationDate.trim();
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