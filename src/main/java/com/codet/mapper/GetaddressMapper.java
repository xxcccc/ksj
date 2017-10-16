package com.codet.mapper;

import com.codet.pojo.Getaddress;
import com.codet.pojo.GetaddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GetaddressMapper {
    int countByExample(GetaddressExample example);

    int deleteByExample(GetaddressExample example);

    int deleteByPrimaryKey(Integer getaddressid);

    int insert(Getaddress record);

    int insertSelective(Getaddress record);

    List<Getaddress> selectByExample(GetaddressExample example);

    Getaddress selectByPrimaryKey(Integer getaddressid);

    int updateByExampleSelective(@Param("record") Getaddress record, @Param("example") GetaddressExample example);

    int updateByExample(@Param("record") Getaddress record, @Param("example") GetaddressExample example);

    int updateByPrimaryKeySelective(Getaddress record);

    int updateByPrimaryKey(Getaddress record);
}