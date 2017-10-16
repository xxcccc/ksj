package com.codet.mapper;

import com.codet.pojo.Relativestype;
import com.codet.pojo.RelativestypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelativestypeMapper {
    int countByExample(RelativestypeExample example);

    int deleteByExample(RelativestypeExample example);

    int deleteByPrimaryKey(Integer relativestypeid);

    int insert(Relativestype record);

    int insertSelective(Relativestype record);

    List<Relativestype> selectByExample(RelativestypeExample example);

    Relativestype selectByPrimaryKey(Integer relativestypeid);

    int updateByExampleSelective(@Param("record") Relativestype record, @Param("example") RelativestypeExample example);

    int updateByExample(@Param("record") Relativestype record, @Param("example") RelativestypeExample example);

    int updateByPrimaryKeySelective(Relativestype record);

    int updateByPrimaryKey(Relativestype record);
}