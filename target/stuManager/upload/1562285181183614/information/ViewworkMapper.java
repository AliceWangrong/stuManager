package com.dao.information;

import com.bean.information.Viewwork;
import com.bean.information.ViewworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewworkMapper {
    long countByExample(ViewworkExample example);

    int deleteByExample(ViewworkExample example);

    int insert(Viewwork record);

    int insertSelective(Viewwork record);

    List<Viewwork> selectByExample(ViewworkExample example);
    List<Viewwork> selectByStuno(Integer stu_no);
    List<Viewwork> selectByTeano(Integer tea_no);
    List<Viewwork> selectByweitijiao(Integer tea_no);
    List<Viewwork> selectByyipigai(Integer tea_no);

    Viewwork selectByworkidAnfstuId(@Param("workId")Integer workId,@Param("stuNo")Integer stuNo);

    int updateByExampleSelective(@Param("record") Viewwork record, @Param("example") ViewworkExample example);

    int updateByExample(@Param("record") Viewwork record, @Param("example") ViewworkExample example);
}