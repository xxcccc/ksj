package com.codet.mapper;

import com.codet.pojo.Healthyprojectdayarrange;
import com.codet.pojo.HealthyprojectdayarrangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthyprojectdayarrangeMapper {
    int countByExample(HealthyprojectdayarrangeExample example);

    int deleteByExample(HealthyprojectdayarrangeExample example);

    int deleteByPrimaryKey(Integer healthyprojectdayarrangeid);

    int insert(Healthyprojectdayarrange record);

    int insertSelective(Healthyprojectdayarrange record);

    List<Healthyprojectdayarrange> selectByExample(HealthyprojectdayarrangeExample example);

    Healthyprojectdayarrange selectByPrimaryKey(Integer healthyprojectdayarrangeid);

    int updateByExampleSelective(@Param("record") Healthyprojectdayarrange record, @Param("example") HealthyprojectdayarrangeExample example);

    int updateByExample(@Param("record") Healthyprojectdayarrange record, @Param("example") HealthyprojectdayarrangeExample example);

    int updateByPrimaryKeySelective(Healthyprojectdayarrange record);

    int updateByPrimaryKey(Healthyprojectdayarrange record);
}