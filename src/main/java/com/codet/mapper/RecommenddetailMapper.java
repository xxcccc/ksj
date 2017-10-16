package com.codet.mapper;

import com.codet.pojo.Recommenddetail;
import com.codet.pojo.RecommenddetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecommenddetailMapper {
    int countByExample(RecommenddetailExample example);

    int deleteByExample(RecommenddetailExample example);

    int deleteByPrimaryKey(Integer recommenddetailid);

    int insert(Recommenddetail record);

    int insertSelective(Recommenddetail record);

    List<Recommenddetail> selectByExample(RecommenddetailExample example);

    Recommenddetail selectByPrimaryKey(Integer recommenddetailid);

    int updateByExampleSelective(@Param("record") Recommenddetail record, @Param("example") RecommenddetailExample example);

    int updateByExample(@Param("record") Recommenddetail record, @Param("example") RecommenddetailExample example);

    int updateByPrimaryKeySelective(Recommenddetail record);

    int updateByPrimaryKey(Recommenddetail record);
}