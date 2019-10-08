package com.bean.information;

public class lasscurr {
    private Integer classId;

    private Integer currId;

    private Integer teaNo;
    private Class aClass;
    private Curriculum curriculum;
    private Teacher teacher;

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

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}