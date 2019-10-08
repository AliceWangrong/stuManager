package com.bean.information;

public class Curriculum {
    private Integer currId;

    private String currName;

    public Integer getCurrId() {
        return currId;
    }

    public void setCurrId(Integer currId) {
        this.currId = currId;
    }

    public String getCurrName() {
        return currName;
    }

    public void setCurrName(String currName) {
        this.currName = currName == null ? null : currName.trim();
    }
}