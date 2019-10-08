package com.bean.information;

public class Workstudent {
    private Integer workNo;

    private Integer stuNo;

    private String workUrl;

    private String workData;

    public Integer getWorkNo() {
        return workNo;
    }

    public void setWorkNo(Integer workNo) {
        this.workNo = workNo;
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public String getWorkUrl() {
        return workUrl;
    }

    public void setWorkUrl(String workUrl) {
        this.workUrl = workUrl == null ? null : workUrl.trim();
    }

    public String getWorkData() {
        return workData;
    }

    public void setWorkData(String workData) {
        this.workData = workData == null ? null : workData.trim();
    }

    @Override
    public String toString() {
        return "Workstudent{" +
                "workNo=" + workNo +
                ", stuNo=" + stuNo +
                ", workUrl='" + workUrl + '\'' +
                ", workData='" + workData + '\'' +
                '}';
    }
}