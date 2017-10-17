package com.codet.mapper;

import com.codet.pojo.Drugandnum;
import com.codet.pojo.DrugandnumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugandnumMapper {
    int countByExample(DrugandnumExample example);

    int deleteByExample(DrugandnumExample example);

    int deleteByPrimaryKey(Integer drugandnumid);

    int insert(Drugandnum record);

    int insertSelective(Drugandnum record);

    List<Drugandnum> selectByExample(DrugandnumExample example);

    Drugandnum selectByPrimaryKey(Integer drugandnumid);

    int updateByExampleSelective(@Param("record") Drugandnum record, @Param("example") DrugandnumExample example);

    int updateByExample(@Param("record") Drugandnum record, @Param("example") DrugandnumExample example);

    int updateByPrimaryKeySelective(Drugandnum record);

    int updateByPrimaryKey(Drugandnum record);
}