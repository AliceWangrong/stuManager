package com.dao.information;

import com.bean.information.Curriculum;
import com.bean.information.CurriculumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumMapper {
    long countByExample(CurriculumExample example);

    int deleteByExample(CurriculumExample example);

    int deleteByPrimaryKey(Integer currId);

    int insert(Curriculum record);

    int insertSelective(Curriculum record);

    List<Curriculum> selectByExample(CurriculumExample example);

    Curriculum selectByPrimaryKey(Integer currId);

    int updateByExampleSelective(@Param("record") Curriculum record, @Param("example") CurriculumExample example);

    int updateByExample(@Param("record") Curriculum record, @Param("example") CurriculumExample example);

    int updateByPrimaryKeySelective(Curriculum record);

    int updateByPrimaryKey(Curriculum record);
}