package com.dao.information;

import com.bean.information.Teacher;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    int selectTeacherLogin(Teacher teacher);
}