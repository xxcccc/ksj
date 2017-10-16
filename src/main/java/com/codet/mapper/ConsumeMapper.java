package com.codet.mapper;

import com.codet.pojo.Consume;
import com.codet.pojo.ConsumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsumeMapper {
    int countByExample(ConsumeExample example);

    int deleteByExample(ConsumeExample example);

    int deleteByPrimaryKey(Integer consumeid);

    int insert(Consume record);

    int insertSelective(Consume record);

    List<Consume> selectByExample(ConsumeExample example);

    Consume selectByPrimaryKey(Integer consumeid);

    int updateByExampleSelective(@Param("record") Consume record, @Param("example") ConsumeExample example);

    int updateByExample(@Param("record") Consume record, @Param("example") ConsumeExample example);

    int updateByPrimaryKeySelective(Consume record);

    int updateByPrimaryKey(Consume record);
}