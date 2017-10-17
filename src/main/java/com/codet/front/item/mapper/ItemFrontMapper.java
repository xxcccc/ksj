package com.codet.front.item.mapper;


import com.codet.pojo.Item;
import com.codet.pojo.ItemExample;
import com.codet.pojo.ItemsQueryPojo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ItemFrontMapper {
    int countByExample(ItemExample example);

    int deleteByExample(ItemExample example);

    int deleteByPrimaryKey(Integer itemid);

    int insert(Item record);

    int insertSelective(Item record);

    List<Item> selectByExample(ItemExample example);

    Item selectByPrimaryKey(Integer itemid);

    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
    
    List<ItemsQueryPojo> itemFindAll(Map<String,Object> map);
    
    
    
}