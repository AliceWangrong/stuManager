package com.bean.information;

public class Class {
    private Integer classId;

    private String className;

    private Integer classCollege;

    private Integer classDepart;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getClassCollege() {
        return classCollege;
    }

    public void setClassCollege(Integer classCollege) {
        this.classCollege = classCollege;
    }

    public Integer getClassDepart() {
        return classDepart;
    }

    public void setClassDepart(Integer classDepart) {
        this.classDepart = classDepart;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", classCollege=" + classCollege +
                ", classDepart=" + classDepart +
                '}';
    }
}