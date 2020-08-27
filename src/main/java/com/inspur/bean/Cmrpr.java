package com.inspur.bean;

public class Cmrpr {
    private Integer cmKey;

    private Integer cmId;

    private String cmTpye;

    private String cmSub;

    private String cmDate;

    private String cmAunit;

    private String cmAperson;

    private String cmRdate;

    private String cmAreason;

    private String cmRemark;

    private String cmAttachment;

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

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public String getCmTpye() {
        return cmTpye;
    }

    public void setCmTpye(String cmTpye) {
        this.cmTpye = cmTpye == null ? null : cmTpye.trim();
    }

    public String getCmSub() {
        return cmSub;
    }

    public void setCmSub(String cmSub) {
        this.cmSub = cmSub == null ? null : cmSub.trim();
    }

    public String getCmDate() {
        return cmDate;
    }

    public void setCmDate(String cmDate) {
        this.cmDate = cmDate == null ? null : cmDate.trim();
    }

    public String getCmAunit() {
        return cmAunit;
    }

    public void setCmAunit(String cmAunit) {
        this.cmAunit = cmAunit == null ? null : cmAunit.trim();
    }

    public String getCmAperson() {
        return cmAperson;
    }

    public void setCmAperson(String cmAperson) {
        this.cmAperson = cmAperson == null ? null : cmAperson.trim();
    }

    public String getCmRdate() {
        return cmRdate;
    }

    public void setCmRdate(String cmRdate) {
        this.cmRdate = cmRdate == null ? null : cmRdate.trim();
    }

    public String getCmAreason() {
        return cmAreason;
    }

    public void setCmAreason(String cmAreason) {
        this.cmAreason = cmAreason == null ? null : cmAreason.trim();
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