package com.codet.mapper;

import com.codet.pojo.Customcourse;
import com.codet.pojo.CustomcourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomcourseMapper {
    int countByExample(CustomcourseExample example);

    int deleteByExample(CustomcourseExample example);

    int deleteByPrimaryKey(Integer customcourseid);

    int insert(Customcourse record);

    int insertSelective(Customcourse record);

    List<Customcourse> selectByExample(CustomcourseExample example);

    Customcourse selectByPrimaryKey(Integer customcourseid);

    int updateByExampleSelective(@Param("record") Customcourse record, @Param("example") CustomcourseExample example);

    int updateByExample(@Param("record") Customcourse record, @Param("example") CustomcourseExample example);

    int updateByPrimaryKeySelective(Customcourse record);

    int updateByPrimaryKey(Customcourse record);
}