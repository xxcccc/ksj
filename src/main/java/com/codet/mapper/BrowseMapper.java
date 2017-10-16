package com.codet.mapper;

import com.codet.pojo.Browse;
import com.codet.pojo.BrowseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrowseMapper {
    int countByExample(BrowseExample example);

    int deleteByExample(BrowseExample example);

    int deleteByPrimaryKey(Integer browseid);

    int insert(Browse record);

    int insertSelective(Browse record);

    List<Browse> selectByExample(BrowseExample example);

    Browse selectByPrimaryKey(Integer browseid);

    int updateByExampleSelective(@Param("record") Browse record, @Param("example") BrowseExample example);

    int updateByExample(@Param("record") Browse record, @Param("example") BrowseExample example);

    int updateByPrimaryKeySelective(Browse record);

    int updateByPrimaryKey(Browse record);
}