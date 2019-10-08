package com.dao.information;

import com.bean.information.Student;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    List<Student> StudentInformationAll();
    List<Student> StudentInformationByclassId(Integer stuClass);
    Student StudentInformationByKey(Integer stuNo);
}