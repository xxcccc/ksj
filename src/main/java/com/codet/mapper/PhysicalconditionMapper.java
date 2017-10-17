package com.codet.mapper;

import com.codet.pojo.Physicalcondition;
import com.codet.pojo.PhysicalconditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhysicalconditionMapper {
    int countByExample(PhysicalconditionExample example);

    int deleteByExample(PhysicalconditionExample example);

    int deleteByPrimaryKey(Integer physicalconditionid);

    int insert(Physicalcondition record);

    int insertSelective(Physicalcondition record);

    List<Physicalcondition> selectByExample(PhysicalconditionExample example);

    Physicalcondition selectByPrimaryKey(Integer physicalconditionid);

    int updateByExampleSelective(@Param("record") Physicalcondition record, @Param("example") PhysicalconditionExample example);

    int updateByExample(@Param("record") Physicalcondition record, @Param("example") PhysicalconditionExample example);

    int updateByPrimaryKeySelective(Physicalcondition record);

    int updateByPrimaryKey(Physicalcondition record);
}