package com.inspur.bean;

public class CLearn {
    private Integer lKey;

    private String lName;

    private String lType;

    private String lDes;

    private String lUrl;

    private String lLine;

    private Integer lUper;

    private String lUnit;

    private String lDate;

    private String lRemarks;

    private String delFlag;

    public Integer getlKey() {
        return lKey;
    }

    public void setlKey(Integer lKey) {
        this.lKey = lKey;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName == null ? null : lName.trim();
    }

    public String getlType() {
        return lType;
    }

    public void setlType(String lType) {
        this.lType = lType == null ? null : lType.trim();
    }

    public String getlDes() {
        return lDes;
    }

    public void setlDes(String lDes) {
        this.lDes = lDes == null ? null : lDes.trim();
    }

    public String getlUrl() {
        return lUrl;
    }

    public void setlUrl(String lUrl) {
        this.lUrl = lUrl == null ? null : lUrl.trim();
    }

    public String getlLine() {
        return lLine;
    }

    public void setlLine(String lLine) {
        this.lLine = lLine == null ? null : lLine.trim();
    }

    public Integer getlUper() {
        return lUper;
    }

    public void setlUper(Integer lUper) {
        this.lUper = lUper;
    }

    public String getlUnit() {
        return lUnit;
    }

    public void setlUnit(String lUnit) {
        this.lUnit = lUnit == null ? null : lUnit.trim();
    }

    public String getlDate() {
        return lDate;
    }

    public void setlDate(String lDate) {
        this.lDate = lDate == null ? null : lDate.trim();
    }

    public String getlRemarks() {
        return lRemarks;
    }

    public void setlRemarks(String lRemarks) {
        this.lRemarks = lRemarks == null ? null : lRemarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}