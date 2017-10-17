package com.codet.mapper;

import com.codet.pojo.Physicalconditiontype;
import com.codet.pojo.PhysicalconditiontypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhysicalconditiontypeMapper {
    int countByExample(PhysicalconditiontypeExample example);

    int deleteByExample(PhysicalconditiontypeExample example);

    int deleteByPrimaryKey(Integer physicalconditiontypeid);

    int insert(Physicalconditiontype record);

    int insertSelective(Physicalconditiontype record);

    List<Physicalconditiontype> selectByExample(PhysicalconditiontypeExample example);

    Physicalconditiontype selectByPrimaryKey(Integer physicalconditiontypeid);

    int updateByExampleSelective(@Param("record") Physicalconditiontype record, @Param("example") PhysicalconditiontypeExample example);

    int updateByExample(@Param("record") Physicalconditiontype record, @Param("example") PhysicalconditiontypeExample example);

    int updateByPrimaryKeySelective(Physicalconditiontype record);

    int updateByPrimaryKey(Physicalconditiontype record);
}