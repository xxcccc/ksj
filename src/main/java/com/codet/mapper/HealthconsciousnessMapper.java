package com.codet.mapper;

import com.codet.pojo.Healthconsciousness;
import com.codet.pojo.HealthconsciousnessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthconsciousnessMapper {
    int countByExample(HealthconsciousnessExample example);

    int deleteByExample(HealthconsciousnessExample example);

    int deleteByPrimaryKey(Integer healthconsciousnessid);

    int insert(Healthconsciousness record);

    int insertSelective(Healthconsciousness record);

    List<Healthconsciousness> selectByExample(HealthconsciousnessExample example);

    Healthconsciousness selectByPrimaryKey(Integer healthconsciousnessid);

    int updateByExampleSelective(@Param("record") Healthconsciousness record, @Param("example") HealthconsciousnessExample example);

    int updateByExample(@Param("record") Healthconsciousness record, @Param("example") HealthconsciousnessExample example);

    int updateByPrimaryKeySelective(Healthconsciousness record);

    int updateByPrimaryKey(Healthconsciousness record);
}