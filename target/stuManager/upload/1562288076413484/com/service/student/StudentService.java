package com.service.student;

import com.bean.information.Viewwork;
import com.bean.information.Workaccomplish;
import com.bean.information.Workpublish;
import com.dao.information.ViewworkMapper;
import com.dao.information.WorkaccomplishMapper;
import com.dao.information.WorkpublishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    WorkaccomplishMapper workaccomplishMapper;
    @Autowired
    ViewworkMapper viewworkMapper;
    public List<Viewwork> selects(Integer work_no){
        List<Viewwork> viewworks=viewworkMapper.selectByStuno(work_no);
        return viewworks;
    }
    public Viewwork selectByworkidAnfstuId(Integer workid,Integer stuid){
        return viewworkMapper.selectByworkidAnfstuId(workid,stuid);
    }

}
