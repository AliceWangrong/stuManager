package com.dao.information;

import com.bean.information.lasscurr;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface lasscurrMapper {

    List<lasscurr> selectBytaeno(Integer tea_no);
    int insert(lasscurr record);

    int insertSelective(lasscurr record);


}