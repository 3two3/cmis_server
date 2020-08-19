package com.inspur.bean;

public class Cmregular {
    private Integer cmKey;

    private Integer cmId;

    private String cmRegularDate;

    private String cmRegularPersonnel;

    private String cmRegularTheme;

    private String cmAttachment;

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

    public String getCmRegularDate() {
        return cmRegularDate;
    }

    public void setCmRegularDate(String cmRegularDate) {
        this.cmRegularDate = cmRegularDate == null ? null : cmRegularDate.trim();
    }

    public String getCmRegularPersonnel() {
        return cmRegularPersonnel;
    }

    public void setCmRegularPersonnel(String cmRegularPersonnel) {
        this.cmRegularPersonnel = cmRegularPersonnel == null ? null : cmRegularPersonnel.trim();
    }

    public String getCmRegularTheme() {
        return cmRegularTheme;
    }

    public void setCmRegularTheme(String cmRegularTheme) {
        this.cmRegularTheme = cmRegularTheme == null ? null : cmRegularTheme.trim();
    }

    public String getCmAttachment() {
        return cmAttachment;
    }

    public void setCmAttachment(String cmAttachment) {
        this.cmAttachment = cmAttachment == null ? null : cmAttachment.trim();
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