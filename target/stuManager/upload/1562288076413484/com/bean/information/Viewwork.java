package com.bean.information;

public class Viewwork {
    private Integer workId;

    private String workUrl;

    private String finallData;

    private Integer stuNo;

    private Integer readNo;

    private String pomt;

    private String evluate;

    private String evluateData;

    private String workData;

    private String workFindata;

    private Integer classId;

    private Integer currId;

    private Integer teaNo;

    private String workRequest;

    private String className;

    private String currName;

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

    public String getWorkData() {
        return workData;
    }

    public void setWorkData(String workData) {
        this.workData = workData == null ? null : workData.trim();
    }

    public String getWorkFindata() {
        return workFindata;
    }

    public void setWorkFindata(String workFindata) {
        this.workFindata = workFindata == null ? null : workFindata.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getCurrId() {
        return currId;
    }

    public void setCurrId(Integer currId) {
        this.currId = currId;
    }

    public Integer getTeaNo() {
        return teaNo;
    }

    public void setTeaNo(Integer teaNo) {
        this.teaNo = teaNo;
    }

    public String getWorkRequest() {
        return workRequest;
    }

    public void setWorkRequest(String workRequest) {
        this.workRequest = workRequest == null ? null : workRequest.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getCurrName() {
        return currName;
    }

    public void setCurrName(String currName) {
        this.currName = currName == null ? null : currName.trim();
    }

    @Override
    public String toString() {
        return "Viewwork{" +
                "workId=" + workId +
                ", workUrl='" + workUrl + '\'' +
                ", finallData='" + finallData + '\'' +
                ", stuNo=" + stuNo +
                ", readNo=" + readNo +
                ", pomt='" + pomt + '\'' +
                ", evluate='" + evluate + '\'' +
                ", evluateData='" + evluateData + '\'' +
                ", workData='" + workData + '\'' +
                ", workFindata='" + workFindata + '\'' +
                ", classId=" + classId +
                ", currId=" + currId +
                ", teaNo=" + teaNo +
                ", workRequest='" + workRequest + '\'' +
                ", className='" + className + '\'' +
                ", currName='" + currName + '\'' +
                '}';
    }
}