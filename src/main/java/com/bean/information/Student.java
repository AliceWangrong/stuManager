package com.bean.information;

public class Student {
    private Integer stuNo;

    private String stuName;

    private Integer stuCollege;

    private Integer stuDepart;

    private Integer stuClass;

    private College college;//院
    private Depart depart;//系
    private Class aclass;//班
    private Connect connect;//联系方式

    public Student(Integer stuNo, String stuName, Integer stuCollege, Integer stuDepart, Integer stuClass, College college, Depart depart, Class aclass, Connect connect) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuCollege = stuCollege;
        this.stuDepart = stuDepart;
        this.stuClass = stuClass;
        this.college = college;
        this.depart = depart;
        this.aclass = aclass;
        this.connect = connect;
    }

    public Student() {
        super();
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuCollege() {
        return stuCollege;
    }

    public void setStuCollege(Integer stuCollege) {
        this.stuCollege = stuCollege;
    }

    public Integer getStuDepart() {
        return stuDepart;
    }

    public void setStuDepart(Integer stuDepart) {
        this.stuDepart = stuDepart;
    }

    public Integer getStuClass() {
        return stuClass;
    }

    public void setStuClass(Integer stuClass) {
        this.stuClass = stuClass;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public Depart getDepart() {
        return depart;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }

    public Class getAclass() {
        return aclass;
    }

    public void setAclass(Class aclass) {
        this.aclass = aclass;
    }

    public Connect getConnect() {
        return connect;
    }

    public void setConnect(Connect connect) {
        this.connect = connect;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", stuName='" + stuName + '\'' +
                ", stuCollege=" + stuCollege +
                ", stuDepart=" + stuDepart +
                ", stuClass=" + stuClass +
                ", college=" + college +
                ", depart=" + depart +
                ", aclass=" + aclass +
                ", connect=" + connect +
                '}';
    }
}