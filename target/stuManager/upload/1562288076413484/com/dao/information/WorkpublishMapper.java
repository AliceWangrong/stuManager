package com.dao.information;

import com.bean.information.Workpublish;
import com.bean.information.WorkpublishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkpublishMapper {
    long countByExample(WorkpublishExample example);

    int deleteByExample(WorkpublishExample example);

    int deleteByPrimaryKey(Integer workId);

    int insert(Workpublish record);

    int insertSelective(Workpublish record);

    List<Workpublish> selectByExample(WorkpublishExample example);

    Workpublish selectByid(Integer work_id);
    int huodeId(Workpublish workpublish);

    Workpublish selectByPrimaryKey(Integer workId);

    int updateByExampleSelective(@Param("record") Workpublish record, @Param("example") WorkpublishExample example);

    int updateByExample(@Param("record") Workpublish record, @Param("example") WorkpublishExample example);

    int updateByPrimaryKeySelective(Workpublish record);

    int updateByPrimaryKey(Workpublish record);
}