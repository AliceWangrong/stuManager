package com.service.student;

import com.dao.information.PassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    PassMapper passMapper;
    private int SUSSESS=100;//成功
    private int FAIL=200;//密码错误
    private int NOTSTUDENT=404;//无此学生
    private int NOTKNOW=500;//不知名错误
    public int Login(Integer stuNo,String stuPass,String loginType){
        String pass;
        System.out.println(loginType);
        if (loginType.equals("T")){
            pass=passMapper.selectPassTeacher(stuNo);
        }else if (loginType.equals("S")){
            pass=passMapper.selectPassStudent(stuNo);
        }
        else {
            return NOTKNOW;//不知名错误
        }
        System.out.println(pass);
        if (pass==null){
            return NOTSTUDENT;
        }
        else if (!pass.equals(stuPass)){
            return FAIL;
        }
        else if(pass.equals(stuPass)){
            return SUSSESS;
        }
        else {
            return NOTKNOW;//不知名错误
        }
    }
}
