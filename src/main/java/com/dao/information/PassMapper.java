package com.dao.information;

import com.bean.information.Pass;

public interface PassMapper {
    String selectPassStudent(Integer stuNo);
    String selectPassTeacher(Integer teaNo);
}
