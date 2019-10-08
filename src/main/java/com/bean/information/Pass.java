package com.bean.information;

public class Pass {
    private Long stuNo;

    private String password;

    public Long getStuNo() {
        return stuNo;
    }

    public void setStuNo(Long stuNo) {
        this.stuNo = stuNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}