package com.codet.mapper;

import com.codet.pojo.Itemtype;
import com.codet.pojo.ItemtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemtypeMapper {
    int countByExample(ItemtypeExample example);

    int deleteByExample(ItemtypeExample example);

    int deleteByPrimaryKey(Integer itemtypeid);

    int insert(Itemtype record);

    int insertSelective(Itemtype record);

    List<Itemtype> selectByExample(ItemtypeExample example);

    Itemtype selectByPrimaryKey(Integer itemtypeid);

    int updateByExampleSelective(@Param("record") Itemtype record, @Param("example") ItemtypeExample example);

    int updateByExample(@Param("record") Itemtype record, @Param("example") ItemtypeExample example);

    int updateByPrimaryKeySelective(Itemtype record);

    int updateByPrimaryKey(Itemtype record);
}