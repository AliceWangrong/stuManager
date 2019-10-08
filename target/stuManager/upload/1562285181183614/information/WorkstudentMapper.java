package com.dao.information;

import com.bean.information.Workstudent;

import java.util.List;

public interface WorkstudentMapper {
    int insert(Workstudent workstudent);
    List<Workstudent> select_all();
    Workstudent selectByKey(String StuNo);
}