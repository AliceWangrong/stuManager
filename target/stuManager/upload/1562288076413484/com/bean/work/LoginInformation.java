package com.bean.work;

public class LoginInformation {
    Integer Stu_no;
    String LoginType;

    public Integer getStu_no() {
        return Stu_no;
    }

    public void setStu_no(Integer stu_no) {
        Stu_no = stu_no;
    }

    public String getLoginType() {
        return LoginType;
    }

    public void setLoginType(String loginType) {
        LoginType = loginType;
    }

    @Override
    public String toString() {
        return "LoginInformation{" +
                "Stu_no=" + Stu_no +
                ", LoginType='" + LoginType + '\'' +
                '}';
    }
}
