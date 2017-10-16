package com.codet.mapper;

import com.codet.pojo.Relatives;
import com.codet.pojo.RelativesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelativesMapper {
    int countByExample(RelativesExample example);

    int deleteByExample(RelativesExample example);

    int deleteByPrimaryKey(Integer relativesid);

    int insert(Relatives record);

    int insertSelective(Relatives record);

    List<Relatives> selectByExample(RelativesExample example);

    Relatives selectByPrimaryKey(Integer relativesid);

    int updateByExampleSelective(@Param("record") Relatives record, @Param("example") RelativesExample example);

    int updateByExample(@Param("record") Relatives record, @Param("example") RelativesExample example);

    int updateByPrimaryKeySelective(Relatives record);

    int updateByPrimaryKey(Relatives record);
}