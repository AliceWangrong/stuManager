package com.handler.student;

import com.bean.information.Student;
import com.bean.information.Viewwork;
import com.dao.information.StudentMapper;
import com.dao.information.WorkaccomplishMapper;
import com.service.student.StudentService;
import com.utils.IDUtils;
import com.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    WorkaccomplishMapper workaccomplishMapper;
    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/Sbanji")
    public ModelAndView banji(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("student/banji");
        return mv;
    }
    @RequestMapping("/Sxinxi")
    public ModelAndView xinxi(){
        List<Student> students=studentMapper.StudentInformationAll();
        ModelAndView mv=new ModelAndView();
        mv.setViewName("student/xinxi");
        mv.addObject("stu",students);
        return mv;
    }
    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("student/login");
        return mv;
    }
    @RequestMapping(value = "/playwork",method = RequestMethod.POST)
    @ResponseBody
    public Msg playwork(@RequestParam("stu_no")Integer stu_no){
        System.out.println(stu_no);
        List<Viewwork> viewworks =studentService.selects(stu_no);
        return Msg.Success().add("viewworks",viewworks);
    }
    @RequestMapping(value = "/chakan")
    public ModelAndView chakan(@RequestParam("workurl")String workurl){
        ModelAndView mv=new  ModelAndView();
        mv.setViewName("teacher/main");
        mv.addObject("url",workurl);
        System.out.println("文件路径"+workurl);
        return mv;
    }
    @RequestMapping(value = "/tijiaopage")
    public ModelAndView tijiaopage(@RequestParam("workid")Integer workid,@RequestParam("stu_id")Integer stuid){
        ModelAndView mv=new ModelAndView();
            Viewwork viewwork = new Viewwork();
            viewwork = studentService.selectByworkidAnfstuId(workid, stuid);
            mv.addObject("viewwork", viewwork);
            mv.setViewName("student/tijiao");
            return mv;
    }
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public ModelAndView tijiao(@RequestParam("workid")Integer workid,@RequestParam("stuid")Integer stuid ,@RequestParam("file") MultipartFile[] files){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("student/success");
        /*System.out.println("文件"+workid);
        System.out.println(stuid);
        System.out.println(files.toString());*/
        SimpleDateFormat df = new SimpleDateFormat("MM-dd HH:mm");//设置日期格式
        String data = df.format(new Date());//提交时间
        String url=save(files);//路径
        workaccomplishMapper.updateByStudent(workid,stuid,url,data);
        return mv;
    }
    public String save(MultipartFile[] file){
        String url_name= IDUtils.getFileName();
        for(MultipartFile f:file){
            File file1 ;
            String name="";
            try {
                if (f instanceof CommonsMultipartFile) {
                    //转换成这个对象，然后我们需要通过里面的FileItem来获得相对路径
                    CommonsMultipartFile f2 = (CommonsMultipartFile) f;
                    name = f2.getFileItem().getName();
                    System.out.println(name + "        ---------相对路径");
                    /* System.out.println(workstudentMapper.insert(workstudent));*/
                    file1 = new File(getProjectPath() + "\\\\"+url_name+"\\\\" + name);
                    file1.mkdirs();
                    file1.createNewFile();
                    f.transferTo(file1);
                }
                System.out.println(f.getOriginalFilename() + "   iii         --------");
                System.out.println("sssss   ");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return url_name;
    }
    public String getProjectPath(){
        String path=System.getProperty("evan.webapp")+"\\\\"+"upload";
        System.out.println(System.getProperty("evan.webapp"));
        return path;
    }
}
