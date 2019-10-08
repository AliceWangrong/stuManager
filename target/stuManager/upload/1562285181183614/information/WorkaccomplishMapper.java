package com.dao.information;

import com.bean.information.Workaccomplish;
import com.bean.information.WorkaccomplishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkaccomplishMapper {
    long countByExample(WorkaccomplishExample example);

    int deleteByExample(WorkaccomplishExample example);

    int insert(Workaccomplish record);

    int insertSelective(Workaccomplish record);

    List<Workaccomplish> selectByExample(WorkaccomplishExample example);
    List<Workaccomplish> selectByid(Integer stu_no);

    int updateByStudent(@Param("workId")Integer workid,@Param("stuNo")Integer stu_id,@Param("workUrl")String url,@Param("finallData")String data);
    int updataBypomt(@Param("workId")Integer workid,@Param("stuNo")Integer stu_id,@Param("pomt")Integer pomt,@Param("evluate")String evluate,@Param("evluate_data")String evluate_data);

    int updateByExampleSelective(@Param("record") Workaccomplish record, @Param("example") WorkaccomplishExample example);

    int updateByExample(@Param("record") Workaccomplish record, @Param("example") WorkaccomplishExample example);
}