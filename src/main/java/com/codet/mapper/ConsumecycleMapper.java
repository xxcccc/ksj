package com.codet.mapper;

import com.codet.pojo.Consumecycle;
import com.codet.pojo.ConsumecycleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsumecycleMapper {
    int countByExample(ConsumecycleExample example);

    int deleteByExample(ConsumecycleExample example);

    int deleteByPrimaryKey(Integer consumecycleid);

    int insert(Consumecycle record);

    int insertSelective(Consumecycle record);

    List<Consumecycle> selectByExample(ConsumecycleExample example);

    Consumecycle selectByPrimaryKey(Integer consumecycleid);

    int updateByExampleSelective(@Param("record") Consumecycle record, @Param("example") ConsumecycleExample example);

    int updateByExample(@Param("record") Consumecycle record, @Param("example") ConsumecycleExample example);

    int updateByPrimaryKeySelective(Consumecycle record);

    int updateByPrimaryKey(Consumecycle record);
}