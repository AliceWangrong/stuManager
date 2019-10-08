package com.handler.teacher;

import com.bean.information.Workstudent;
import com.service.student.FileService;
import com.utils.Msg;
import com.utils.ReadDepthFile;
import com.utils.ReadTxt;
import com.utils.Tree;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;

@Controller
public class FaileController {
    @Autowired
    FileService fileService;

    @RequestMapping("/failname")
    @ResponseBody
    public Msg failnme(@RequestParam("url")String url){
        System.out.println("请求到达");
        /*Workstudent workstudent=fileService.selectByKey("177405110");*/
        ReadDepthFile readDepthFile=new ReadDepthFile();
        File file2 = new File(getProjectPath()+"upload"+"\\"+url);
        Tree tree=new Tree();
        Tree rtree=readDepthFile.FileRowList(file2);
        System.out.println(rtree);
        return Msg.Success().add("tree",rtree);
    }
    @RequestMapping(value = "/Showfail",method = RequestMethod.POST)
    @ResponseBody
    public Msg ShowFail(@Param("path")String path) throws IOException {
        System.out.println(path);
        ReadTxt readTxt=new ReadTxt();
        File file=new File(getProjectPath()+path);
        StringBuffer stringBuffer=readTxt.reasd(file);
        System.out.println(stringBuffer);
        return Msg.Success().add("bf",stringBuffer);
    }
    public String getProjectPath(){
        String path=System.getProperty("evan.webapp")+"\\\\";
        System.out.println(System.getProperty("evan.webapp"));
        return path;
    }
}
