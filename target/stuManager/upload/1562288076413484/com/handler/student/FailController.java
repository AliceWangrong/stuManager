package com.handler.student;

import com.bean.information.Workstudent;
import com.service.student.FileService;
import com.utils.IDUtils;
import com.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class FailController {
    @Autowired
    FileService fileService;


    @RequestMapping("/fail")
    public ModelAndView fail(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("student/fail");
        return mv;
    }
    //@RequestMapping("/upload")
    public String upload(@RequestParam("type")int type, @RequestParam("file") MultipartFile[] file){
        Workstudent workstudent=new Workstudent();
        String url_name= IDUtils.getFileName();
        workstudent.setStuNo(177405110);
        workstudent.setWorkUrl(url_name);
        SimpleDateFormat df = new SimpleDateFormat("MM-dd HH:mm");//设置日期格式
        String data = df.format(new Date());
        workstudent.setWorkData(data);
        int statu = 0;
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
        try {
            statu=fileService.setWork(workstudent);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(statu>0){
          System.out.println("上传成功");
        }else {
            System.out.println("上传失败");
        }
        return "student/fail";
    }
    public String getProjectPath(){
        String path=System.getProperty("evan.webapp")+"\\\\"+"upload";
        System.out.println(System.getProperty("evan.webapp"));
        return path;
    }
}
