package com.bean.information;

public class TeaPass {
    private Integer teaNo;

    private String teaPass;

    public Integer getTeaNo() {
        return teaNo;
    }

    public void setTeaNo(Integer teaNo) {
        this.teaNo = teaNo;
    }

    public String getTeaPass() {
        return teaPass;
    }

    public void setTeaPass(String teaPass) {
        this.teaPass = teaPass == null ? null : teaPass.trim();
    }
}