package com.codet.mapper;

import com.codet.pojo.Healtrecords;
import com.codet.pojo.HealtrecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealtrecordsMapper {
    int countByExample(HealtrecordsExample example);

    int deleteByExample(HealtrecordsExample example);

    int deleteByPrimaryKey(Integer healtrecordsid);

    int insert(Healtrecords record);

    int insertSelective(Healtrecords record);

    List<Healtrecords> selectByExample(HealtrecordsExample example);

    Healtrecords selectByPrimaryKey(Integer healtrecordsid);

    int updateByExampleSelective(@Param("record") Healtrecords record, @Param("example") HealtrecordsExample example);

    int updateByExample(@Param("record") Healtrecords record, @Param("example") HealtrecordsExample example);

    int updateByPrimaryKeySelective(Healtrecords record);

    int updateByPrimaryKey(Healtrecords record);
}