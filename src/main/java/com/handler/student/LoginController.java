package com.handler.student;

import com.bean.work.LoginInformation;
import com.service.student.LoginService;
import com.utils.Msg;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.net.ssl.SSLEngine;
import javax.servlet.http.HttpSession;

@SessionAttributes("loginInformation")
@Controller
public class LoginController {
    LoginInformation loginInformation=new LoginInformation();
    @Autowired
    LoginService loginService;
    private int NOTKNOW=500;//不知名错误
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Msg login(@Param("stuNo")String stuNoString, @Param("stuPass")String stuPass, @Param("loginType")String loginType){
        System.out.println("学号："+stuNoString+"   密码："+stuPass+"   类型："+loginType);
        stuNoString=stuNoString.substring(stuNoString.length()-9,stuNoString.length());
        Integer stuNo= Integer.valueOf(stuNoString);
        System.out.println(stuNo);
        Integer status;
        status=loginService.Login(stuNo,stuPass,loginType);
        if (status==100){
            return Msg.setStatus(status).add("loginType",loginType).add("no",stuNo);
        }
        else {
            return Msg.setStatus(status).add("loginType", loginType);
        }
    }
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("student/index");
        return mv;
    }
    @RequestMapping("/teacher")
    public ModelAndView teacher(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("teacher/index");
        return mv;
    }
    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("teacher/main");
        return mv;
    }
}
