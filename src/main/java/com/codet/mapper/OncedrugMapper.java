package com.codet.mapper;

import com.codet.pojo.Oncedrug;
import com.codet.pojo.OncedrugExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OncedrugMapper {
    int countByExample(OncedrugExample example);

    int deleteByExample(OncedrugExample example);

    int deleteByPrimaryKey(Integer oncedrugid);

    int insert(Oncedrug record);

    int insertSelective(Oncedrug record);

    List<Oncedrug> selectByExample(OncedrugExample example);

    Oncedrug selectByPrimaryKey(Integer oncedrugid);

    int updateByExampleSelective(@Param("record") Oncedrug record, @Param("example") OncedrugExample example);

    int updateByExample(@Param("record") Oncedrug record, @Param("example") OncedrugExample example);

    int updateByPrimaryKeySelective(Oncedrug record);

    int updateByPrimaryKey(Oncedrug record);
}