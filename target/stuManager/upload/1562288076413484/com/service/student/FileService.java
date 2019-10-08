package com.service.student;

import com.bean.information.Workstudent;
import com.dao.information.WorkstudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileService {
    @Autowired
    WorkstudentMapper workstudentMapper;
    public int setWork(Workstudent workstudent){
        return this.workstudentMapper.insert(workstudent);
    }
    public List<Workstudent> selectAll(){
        return this.workstudentMapper.select_all();
    }
    public Workstudent selectByKey(String StuNo){
        return this.workstudentMapper.selectByKey(StuNo);
    }

}
