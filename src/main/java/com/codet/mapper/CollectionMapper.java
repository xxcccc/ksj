package com.codet.mapper;

import com.codet.pojo.Collection;
import com.codet.pojo.CollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectionMapper {
    int countByExample(CollectionExample example);

    int deleteByExample(CollectionExample example);

    int deleteByPrimaryKey(Integer conllectionid);

    int insert(Collection record);

    int insertSelective(Collection record);

    List<Collection> selectByExample(CollectionExample example);

    Collection selectByPrimaryKey(Integer conllectionid);

    int updateByExampleSelective(@Param("record") Collection record, @Param("example") CollectionExample example);

    int updateByExample(@Param("record") Collection record, @Param("example") CollectionExample example);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);
}