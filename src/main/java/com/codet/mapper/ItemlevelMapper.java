package com.codet.mapper;

import com.codet.pojo.Itemlevel;
import com.codet.pojo.ItemlevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemlevelMapper {
    int countByExample(ItemlevelExample example);

    int deleteByExample(ItemlevelExample example);

    int deleteByPrimaryKey(Integer itemlevelid);

    int insert(Itemlevel record);

    int insertSelective(Itemlevel record);

    List<Itemlevel> selectByExample(ItemlevelExample example);

    Itemlevel selectByPrimaryKey(Integer itemlevelid);

    int updateByExampleSelective(@Param("record") Itemlevel record, @Param("example") ItemlevelExample example);

    int updateByExample(@Param("record") Itemlevel record, @Param("example") ItemlevelExample example);

    int updateByPrimaryKeySelective(Itemlevel record);

    int updateByPrimaryKey(Itemlevel record);
}