package com.bean.information;

public class Workpublish {
    private Integer workId;

    private String workRequest;

    private String workData;

    private String workFindata;

    private Integer classId;

    private Integer currId;

    private Integer teaNo;

    private Curriculum curriculum;
    private Class banji;

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public Class getaClass() {
        return banji;
    }

    public void setaClass(Class aClass) {
        this.banji = aClass;
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public String getWorkRequest() {
        return workRequest;
    }

    public void setWorkRequest(String workRequest) {
        this.workRequest = workRequest == null ? null : workRequest.trim();
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

    @Override
    public String toString() {
        return "Workpublish{" +
                "workId=" + workId +
                ", workRequest='" + workRequest + '\'' +
                ", workData='" + workData + '\'' +
                ", workFindata='" + workFindata + '\'' +
                ", classId=" + classId +
                ", currId=" + currId +
                ", teaNo=" + teaNo +
                '}';
    }
}