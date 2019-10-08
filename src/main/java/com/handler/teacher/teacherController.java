package com.handler.teacher;

import com.bean.information.Viewwork;
import com.bean.information.Workpublish;
import com.bean.information.lasscurr;
import com.dao.information.ViewworkMapper;
import com.dao.information.WorkaccomplishMapper;
import com.dao.information.lasscurrMapper;
import com.service.teacher.teacherService;
import com.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class teacherController {
    @Autowired
    teacherService teacherService;
    @Autowired
    lasscurrMapper lasscurrMapper;
    @Autowired
    ViewworkMapper viewworkMapper;
    @Autowired
    WorkaccomplishMapper workaccomplishMapper;
    @RequestMapping("/workpublish")
    public ModelAndView workpublish(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("teacher/workPublish");
        return mv;
    }
    @RequestMapping("/pigai")
    public ModelAndView pigai(){
        Integer no=123456789;
        List<Viewwork> viewworks=viewworkMapper.selectByTeano(no);
        ModelAndView mv=new ModelAndView();
        mv.addObject("viewworks",viewworks);
        mv.setViewName("teacher/pigai");
        return mv;
    }
    @RequestMapping("/chaxun")
    public ModelAndView chaxun(){
        Integer no=123456789;
        List<Viewwork> viewworks1=viewworkMapper.selectByweitijiao(no);//未提交
        List<Viewwork> viewworks=viewworkMapper.selectByTeano(no);//已提交
        List<Viewwork> viewworks2=viewworkMapper.selectByyipigai(no);//已批该
        ModelAndView mv=new ModelAndView();
        mv.addObject("viewworks1",viewworks1);
        mv.addObject("viewworks",viewworks);
        mv.addObject("viewworks2",viewworks2);
        mv.setViewName("teacher/chaxun");
        return mv;
    }
    @RequestMapping("/xinxi")
    public ModelAndView xinxi(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("teacher/xinxi");
        return mv;
    }
    @RequestMapping("/banji")
    public ModelAndView banji(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("teacher/banji");
        return mv;
    }
    @RequestMapping("/play")
    public ModelAndView play(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("student/playwork");
        return mv;
    }
    @RequestMapping("/select")
    @ResponseBody
    public Msg select(@RequestParam("id")Integer id){
        List<lasscurr> lasscurrs=teacherService.list(id);

        return Msg.Success().add("lasscurrs",lasscurrs);
    }
    @RequestMapping(value = "/workpublish_from",method = RequestMethod.POST)
    @ResponseBody
    public Msg workpublish_from(Workpublish workpublish){
        System.out.println(workpublish);
        int i=teacherService.publish(workpublish);
        if(i==1){
            return Msg.Success();
        }
        else{
            return Msg.fail();
        }
    }
    @RequestMapping(value = "/piyue",method = RequestMethod.POST)
    @ResponseBody
    public Msg piyue(@RequestParam("workid")Integer workid,@RequestParam("stuNo")Integer stuNo,@RequestParam("pomt")Integer pomt,@RequestParam("speak")String speak){
        SimpleDateFormat df = new SimpleDateFormat("MM-dd HH:mm");//设置日期格式
        String data = df.format(new Date());
        System.out.println(workid+"   "+stuNo+"  "+pomt+"    "+speak);
        int i=workaccomplishMapper.updataBypomt(workid,stuNo,pomt,speak,data);
        if(i>0){
            return Msg.Success();
        }
       /* else {*/
            return Msg.fail();
       /* }*/
    }
}
