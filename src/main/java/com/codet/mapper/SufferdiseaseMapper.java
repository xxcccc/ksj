package com.codet.mapper;

import com.codet.pojo.Sufferdisease;
import com.codet.pojo.SufferdiseaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SufferdiseaseMapper {
    int countByExample(SufferdiseaseExample example);

    int deleteByExample(SufferdiseaseExample example);

    int deleteByPrimaryKey(Integer sufferdiseaseid);

    int insert(Sufferdisease record);

    int insertSelective(Sufferdisease record);

    List<Sufferdisease> selectByExample(SufferdiseaseExample example);

    Sufferdisease selectByPrimaryKey(Integer sufferdiseaseid);

    int updateByExampleSelective(@Param("record") Sufferdisease record, @Param("example") SufferdiseaseExample example);

    int updateByExample(@Param("record") Sufferdisease record, @Param("example") SufferdiseaseExample example);

    int updateByPrimaryKeySelective(Sufferdisease record);

    int updateByPrimaryKey(Sufferdisease record);
}