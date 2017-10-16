package com.codet.mapper;

import com.codet.pojo.Evaluetalevel;
import com.codet.pojo.EvaluetalevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluetalevelMapper {
    int countByExample(EvaluetalevelExample example);

    int deleteByExample(EvaluetalevelExample example);

    int deleteByPrimaryKey(Integer evaluetalevelid);

    int insert(Evaluetalevel record);

    int insertSelective(Evaluetalevel record);

    List<Evaluetalevel> selectByExample(EvaluetalevelExample example);

    Evaluetalevel selectByPrimaryKey(Integer evaluetalevelid);

    int updateByExampleSelective(@Param("record") Evaluetalevel record, @Param("example") EvaluetalevelExample example);

    int updateByExample(@Param("record") Evaluetalevel record, @Param("example") EvaluetalevelExample example);

    int updateByPrimaryKeySelective(Evaluetalevel record);

    int updateByPrimaryKey(Evaluetalevel record);
}