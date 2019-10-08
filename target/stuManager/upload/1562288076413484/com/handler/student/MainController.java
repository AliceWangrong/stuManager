package com.handler.student;

import com.bean.information.Student;
import com.service.student.MainService;
import com.utils.Msg;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    MainService mainService;

    @RequestMapping("/information")
    @ResponseBody
    public Msg information(@Param("stu_no")Integer stu_no){
        Student student=mainService.selectBykey(stu_no);
        System.out.println("登录成功"+stu_no+"   "+student);
        return Msg.Success().add("stu",student);
    }
}
