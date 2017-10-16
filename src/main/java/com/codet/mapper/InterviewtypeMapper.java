package com.codet.mapper;

import com.codet.pojo.Interviewtype;
import com.codet.pojo.InterviewtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterviewtypeMapper {
    int countByExample(InterviewtypeExample example);

    int deleteByExample(InterviewtypeExample example);

    int deleteByPrimaryKey(Integer interviewtypeid);

    int insert(Interviewtype record);

    int insertSelective(Interviewtype record);

    List<Interviewtype> selectByExample(InterviewtypeExample example);

    Interviewtype selectByPrimaryKey(Integer interviewtypeid);

    int updateByExampleSelective(@Param("record") Interviewtype record, @Param("example") InterviewtypeExample example);

    int updateByExample(@Param("record") Interviewtype record, @Param("example") InterviewtypeExample example);

    int updateByPrimaryKeySelective(Interviewtype record);

    int updateByPrimaryKey(Interviewtype record);
}