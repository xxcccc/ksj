package com.codet.mapper;

import com.codet.pojo.Coursedetailed;
import com.codet.pojo.CoursedetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursedetailedMapper {
    int countByExample(CoursedetailedExample example);

    int deleteByExample(CoursedetailedExample example);

    int deleteByPrimaryKey(Integer coursedetailedid);

    int insert(Coursedetailed record);

    int insertSelective(Coursedetailed record);

    List<Coursedetailed> selectByExample(CoursedetailedExample example);

    Coursedetailed selectByPrimaryKey(Integer coursedetailedid);

    int updateByExampleSelective(@Param("record") Coursedetailed record, @Param("example") CoursedetailedExample example);

    int updateByExample(@Param("record") Coursedetailed record, @Param("example") CoursedetailedExample example);

    int updateByPrimaryKeySelective(Coursedetailed record);

    int updateByPrimaryKey(Coursedetailed record);
}