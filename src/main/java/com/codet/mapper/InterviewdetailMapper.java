package com.codet.mapper;

import com.codet.pojo.Interviewdetail;
import com.codet.pojo.InterviewdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterviewdetailMapper {
    int countByExample(InterviewdetailExample example);

    int deleteByExample(InterviewdetailExample example);

    int deleteByPrimaryKey(Integer interviewdetailid);

    int insert(Interviewdetail record);

    int insertSelective(Interviewdetail record);

    List<Interviewdetail> selectByExample(InterviewdetailExample example);

    Interviewdetail selectByPrimaryKey(Integer interviewdetailid);

    int updateByExampleSelective(@Param("record") Interviewdetail record, @Param("example") InterviewdetailExample example);

    int updateByExample(@Param("record") Interviewdetail record, @Param("example") InterviewdetailExample example);

    int updateByPrimaryKeySelective(Interviewdetail record);

    int updateByPrimaryKey(Interviewdetail record);
}