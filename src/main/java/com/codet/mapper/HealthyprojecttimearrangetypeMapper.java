package com.codet.mapper;

import com.codet.pojo.Healthyprojecttimearrangetype;
import com.codet.pojo.HealthyprojecttimearrangetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthyprojecttimearrangetypeMapper {
    int countByExample(HealthyprojecttimearrangetypeExample example);

    int deleteByExample(HealthyprojecttimearrangetypeExample example);

    int deleteByPrimaryKey(Integer projecttimearrangetypeid);

    int insert(Healthyprojecttimearrangetype record);

    int insertSelective(Healthyprojecttimearrangetype record);

    List<Healthyprojecttimearrangetype> selectByExample(HealthyprojecttimearrangetypeExample example);

    Healthyprojecttimearrangetype selectByPrimaryKey(Integer projecttimearrangetypeid);

    int updateByExampleSelective(@Param("record") Healthyprojecttimearrangetype record, @Param("example") HealthyprojecttimearrangetypeExample example);

    int updateByExample(@Param("record") Healthyprojecttimearrangetype record, @Param("example") HealthyprojecttimearrangetypeExample example);

    int updateByPrimaryKeySelective(Healthyprojecttimearrangetype record);

    int updateByPrimaryKey(Healthyprojecttimearrangetype record);
}