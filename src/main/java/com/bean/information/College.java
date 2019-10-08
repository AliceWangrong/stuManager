package com.bean.information;

public class College {
    private Integer collegeId;

    private String collageName;

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName == null ? null : collageName.trim();
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeId=" + collegeId +
                ", collageName='" + collageName + '\'' +
                '}';
    }
}