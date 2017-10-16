package com.codet.mapper;

import com.codet.pojo.Healthyproject;
import com.codet.pojo.HealthyprojectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthyprojectMapper {
    int countByExample(HealthyprojectExample example);

    int deleteByExample(HealthyprojectExample example);

    int deleteByPrimaryKey(Integer healthyprojectid);

    int insert(Healthyproject record);

    int insertSelective(Healthyproject record);

    List<Healthyproject> selectByExample(HealthyprojectExample example);

    Healthyproject selectByPrimaryKey(Integer healthyprojectid);

    int updateByExampleSelective(@Param("record") Healthyproject record, @Param("example") HealthyprojectExample example);

    int updateByExample(@Param("record") Healthyproject record, @Param("example") HealthyprojectExample example);

    int updateByPrimaryKeySelective(Healthyproject record);

    int updateByPrimaryKey(Healthyproject record);
}