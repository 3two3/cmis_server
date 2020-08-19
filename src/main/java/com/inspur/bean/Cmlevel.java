package com.inspur.bean;

public class Cmlevel {
    private Integer cmKey;

    private String cmId;

    private String cmHoldDate;

    private String cmHoldLevel;

    private String cmHoldTpye;

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

    public String getCmId() {
        return cmId;
    }

    public void setCmId(String cmId) {
        this.cmId = cmId == null ? null : cmId.trim();
    }

    public String getCmHoldDate() {
        return cmHoldDate;
    }

    public void setCmHoldDate(String cmHoldDate) {
        this.cmHoldDate = cmHoldDate == null ? null : cmHoldDate.trim();
    }

    public String getCmHoldLevel() {
        return cmHoldLevel;
    }

    public void setCmHoldLevel(String cmHoldLevel) {
        this.cmHoldLevel = cmHoldLevel == null ? null : cmHoldLevel.trim();
    }

    public String getCmHoldTpye() {
        return cmHoldTpye;
    }

    public void setCmHoldTpye(String cmHoldTpye) {
        this.cmHoldTpye = cmHoldTpye == null ? null : cmHoldTpye.trim();
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