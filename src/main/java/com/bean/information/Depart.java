package com.bean.information;

public class Depart {
    private Integer departId;

    private String departName;

    private Integer deptFromcollege;

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public Integer getDeptFromcollege() {
        return deptFromcollege;
    }

    public void setDeptFromcollege(Integer deptFromcollege) {
        this.deptFromcollege = deptFromcollege;
    }

    @Override
    public String toString() {
        return "Depart{" +
                "departId=" + departId +
                ", departName='" + departName + '\'' +
                ", deptFromcollege=" + deptFromcollege +
                '}';
    }
}