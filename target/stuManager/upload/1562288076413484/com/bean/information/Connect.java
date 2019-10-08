package com.bean.information;

public class Connect {
    private Integer stuNo;

    private String stuQq;

    private String stuPhone;

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuQq() {
        return stuQq;
    }

    public void setStuQq(String stuQq) {
        this.stuQq = stuQq == null ? null : stuQq.trim();
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone == null ? null : stuPhone.trim();
    }

    @Override
    public String toString() {
        return "Connect{" +
                "stuNo=" + stuNo +
                ", stuQq='" + stuQq + '\'' +
                ", stuPhone='" + stuPhone + '\'' +
                '}';
    }
}