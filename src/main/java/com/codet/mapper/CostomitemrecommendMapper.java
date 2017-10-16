package com.codet.mapper;

import com.codet.pojo.Costomitemrecommend;
import com.codet.pojo.CostomitemrecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostomitemrecommendMapper {
    int countByExample(CostomitemrecommendExample example);

    int deleteByExample(CostomitemrecommendExample example);

    int deleteByPrimaryKey(Integer customitemrecommendid);

    int insert(Costomitemrecommend record);

    int insertSelective(Costomitemrecommend record);

    List<Costomitemrecommend> selectByExample(CostomitemrecommendExample example);

    Costomitemrecommend selectByPrimaryKey(Integer customitemrecommendid);

    int updateByExampleSelective(@Param("record") Costomitemrecommend record, @Param("example") CostomitemrecommendExample example);

    int updateByExample(@Param("record") Costomitemrecommend record, @Param("example") CostomitemrecommendExample example);

    int updateByPrimaryKeySelective(Costomitemrecommend record);

    int updateByPrimaryKey(Costomitemrecommend record);
}