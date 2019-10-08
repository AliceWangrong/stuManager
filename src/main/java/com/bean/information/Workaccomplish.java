package com.bean.information;

public class Workaccomplish {
    private Integer workId;

    private String workUrl;

    private String finallData;

    private Integer stuNo;

    private Integer readNo;

    private String pomt;

    private String evluate;

    private String evluateData;

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public String getWorkUrl() {
        return workUrl;
    }

    public void setWorkUrl(String workUrl) {
        this.workUrl = workUrl == null ? null : workUrl.trim();
    }

    public String getFinallData() {
        return finallData;
    }

    public void setFinallData(String finallData) {
        this.finallData = finallData == null ? null : finallData.trim();
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public Integer getReadNo() {
        return readNo;
    }

    public void setReadNo(Integer readNo) {
        this.readNo = readNo;
    }

    public String getPomt() {
        return pomt;
    }

    public void setPomt(String pomt) {
        this.pomt = pomt == null ? null : pomt.trim();
    }

    public String getEvluate() {
        return evluate;
    }

    public void setEvluate(String evluate) {
        this.evluate = evluate == null ? null : evluate.trim();
    }

    public String getEvluateData() {
        return evluateData;
    }

    public void setEvluateData(String evluateData) {
        this.evluateData = evluateData == null ? null : evluateData.trim();
    }

    public Workaccomplish(Integer workId, String workUrl, String finallData, Integer stuNo, Integer readNo, String pomt, String evluate, String evluateData) {
        this.workId = workId;
        this.workUrl = workUrl;
        this.finallData = finallData;
        this.stuNo = stuNo;
        this.readNo = readNo;
        this.pomt = pomt;
        this.evluate = evluate;
        this.evluateData = evluateData;
    }
}