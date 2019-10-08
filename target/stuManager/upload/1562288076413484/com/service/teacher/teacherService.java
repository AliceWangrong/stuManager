package com.service.teacher;

import com.bean.information.Student;
import com.bean.information.Workaccomplish;
import com.bean.information.Workpublish;
import com.bean.information.lasscurr;
import com.dao.information.StudentMapper;
import com.dao.information.WorkaccomplishMapper;
import com.dao.information.WorkpublishMapper;
import com.dao.information.lasscurrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class teacherService {
    @Autowired
    lasscurrMapper lasscurrMapper;
    @Autowired
    WorkpublishMapper workpublishMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    WorkaccomplishMapper workaccomplishMapper;
    //老师作业发布
    public int publish(Workpublish workpublish){
        //提取发布日期
        int r=0;
        SimpleDateFormat df = new SimpleDateFormat("MM-dd HH:mm");//设置日期格式
        String data = df.format(new Date());
        workpublish.setWorkData(data);
        workpublishMapper.insert(workpublish);
        Integer i=workpublishMapper.huodeId(workpublish);
        //获取插入主键值
        //
        System.out.println("插入主键值"+i);
        //获取所属班级学生信息
        Integer classid=workpublish.getClassId();
        //根据班级信息生成每个学生作业表，包括，作业号i  完成人：查询的每个学生    是否批改：0
        //先根据班级查询学生学号
        List<Student> students;
        students=studentMapper.StudentInformationByclassId(classid);
         for(Student student:students){
             Integer stu_no=student.getStuNo();
             Workaccomplish workaccomplish=new Workaccomplish(i,null,null,stu_no,0,null,null,null);
             workaccomplishMapper.insertSelective(workaccomplish);
         }
         i=1;
        return r;
    }

    //作业提交下拉列表
    public List<lasscurr> list(Integer id){
        return this.lasscurrMapper.selectBytaeno(id);
    }

    //老师作业情况查询      按班级查询

    //学生作业情况查询

    //学生作业提交

    //学生作业查看

    //学生作业列表
}
