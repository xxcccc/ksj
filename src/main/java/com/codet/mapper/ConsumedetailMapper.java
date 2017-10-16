package com.codet.mapper;

import com.codet.pojo.Consumedetail;
import com.codet.pojo.ConsumedetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsumedetailMapper {
    int countByExample(ConsumedetailExample example);

    int deleteByExample(ConsumedetailExample example);

    int deleteByPrimaryKey(Integer consumedetailid);

    int insert(Consumedetail record);

    int insertSelective(Consumedetail record);

    List<Consumedetail> selectByExample(ConsumedetailExample example);

    Consumedetail selectByPrimaryKey(Integer consumedetailid);

    int updateByExampleSelective(@Param("record") Consumedetail record, @Param("example") ConsumedetailExample example);

    int updateByExample(@Param("record") Consumedetail record, @Param("example") ConsumedetailExample example);

    int updateByPrimaryKeySelective(Consumedetail record);

    int updateByPrimaryKey(Consumedetail record);
}