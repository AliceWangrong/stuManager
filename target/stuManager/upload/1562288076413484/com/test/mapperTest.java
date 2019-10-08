package com.test;

import com.dao.information.WorkaccomplishMapper;
import com.service.student.StudentService;
import com.service.teacher.teacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class mapperTest {
    @Autowired
    teacherService teacherService;
    @Autowired
    StudentService studentService;
    @Autowired
    WorkaccomplishMapper workaccomplishMapper;
    @Test
    public void mapper(){
        Integer stu_no=177405138;
        Integer workid=2;
        String a= String.valueOf(13);
        int i=workaccomplishMapper.updataBypomt(18,123123123,13,"好","2019");
        System.out.println(i);
        /*List<Viewwork> viewworks =studentService.selects(stu_no);
        System.out.println(viewworks);
        System.out.println("你好");*/
        /*System.out.println(studentService.selectByworkidAnfstuId(workid,stu_no));*/

    }
}
