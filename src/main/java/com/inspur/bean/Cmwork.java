package com.inspur.bean;

public class Cmwork {
    private Integer cmKey;

    private String cmId;

    private String cmOfficeDate;

    private String cmPosition;

    private String cmUnit;

    private String cmAttachment;

    private String cmModificationDate;

    private String cmModificationPerson;

    private String cmRemarks;

    private String delFlag;

    private String cmWork;

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

    public String getCmOfficeDate() {
        return cmOfficeDate;
    }

    public void setCmOfficeDate(String cmOfficeDate) {
        this.cmOfficeDate = cmOfficeDate == null ? null : cmOfficeDate.trim();
    }

    public String getCmPosition() {
        return cmPosition;
    }

    public void setCmPosition(String cmPosition) {
        this.cmPosition = cmPosition == null ? null : cmPosition.trim();
    }

    public String getCmUnit() {
        return cmUnit;
    }

    public void setCmUnit(String cmUnit) {
        this.cmUnit = cmUnit == null ? null : cmUnit.trim();
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

    public String getCmWork() {
        return cmWork;
    }

    public void setCmWork(String cmWork) {
        this.cmWork = cmWork == null ? null : cmWork.trim();
    }
}