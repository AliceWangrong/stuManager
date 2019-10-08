package com.service.student;

import com.bean.information.Student;
import com.dao.information.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    @Autowired
    StudentMapper studentMapper;
    public Student selectBykey(Integer stu_no){
        return this.studentMapper.StudentInformationByKey(stu_no);
    }
}
