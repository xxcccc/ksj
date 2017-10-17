package com.codet.mapper;

import com.codet.pojo.Diseasetype;
import com.codet.pojo.DiseasetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiseasetypeMapper {
    int countByExample(DiseasetypeExample example);

    int deleteByExample(DiseasetypeExample example);

    int deleteByPrimaryKey(Integer diseasetypeid);

    int insert(Diseasetype record);

    int insertSelective(Diseasetype record);

    List<Diseasetype> selectByExample(DiseasetypeExample example);

    Diseasetype selectByPrimaryKey(Integer diseasetypeid);

    int updateByExampleSelective(@Param("record") Diseasetype record, @Param("example") DiseasetypeExample example);

    int updateByExample(@Param("record") Diseasetype record, @Param("example") DiseasetypeExample example);

    int updateByPrimaryKeySelective(Diseasetype record);

    int updateByPrimaryKey(Diseasetype record);
}