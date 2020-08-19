package com.inspur.bean;

public class Cmresults {
    private Integer cmKey;

    private String cmId;

    private String cmYear;

    private String cmResult;

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

    public String getCmId() {
        return cmId;
    }

    public void setCmId(String cmId) {
        this.cmId = cmId == null ? null : cmId.trim();
    }

    public String getCmYear() {
        return cmYear;
    }

    public void setCmYear(String cmYear) {
        this.cmYear = cmYear == null ? null : cmYear.trim();
    }

    public String getCmResult() {
        return cmResult;
    }

    public void setCmResult(String cmResult) {
        this.cmResult = cmResult == null ? null : cmResult.trim();
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