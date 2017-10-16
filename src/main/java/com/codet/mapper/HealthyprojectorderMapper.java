package com.codet.mapper;

import com.codet.pojo.Healthyprojectorder;
import com.codet.pojo.HealthyprojectorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthyprojectorderMapper {
    int countByExample(HealthyprojectorderExample example);

    int deleteByExample(HealthyprojectorderExample example);

    int deleteByPrimaryKey(Integer healthyprojectorderid);

    int insert(Healthyprojectorder record);

    int insertSelective(Healthyprojectorder record);

    List<Healthyprojectorder> selectByExample(HealthyprojectorderExample example);

    Healthyprojectorder selectByPrimaryKey(Integer healthyprojectorderid);

    int updateByExampleSelective(@Param("record") Healthyprojectorder record, @Param("example") HealthyprojectorderExample example);

    int updateByExample(@Param("record") Healthyprojectorder record, @Param("example") HealthyprojectorderExample example);

    int updateByPrimaryKeySelective(Healthyprojectorder record);

    int updateByPrimaryKey(Healthyprojectorder record);
}