package com.codet.mapper;

import com.codet.pojo.Nowdrug;
import com.codet.pojo.NowdrugExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NowdrugMapper {
    int countByExample(NowdrugExample example);

    int deleteByExample(NowdrugExample example);

    int deleteByPrimaryKey(Integer nowdrugid);

    int insert(Nowdrug record);

    int insertSelective(Nowdrug record);

    List<Nowdrug> selectByExample(NowdrugExample example);

    Nowdrug selectByPrimaryKey(Integer nowdrugid);

    int updateByExampleSelective(@Param("record") Nowdrug record, @Param("example") NowdrugExample example);

    int updateByExample(@Param("record") Nowdrug record, @Param("example") NowdrugExample example);

    int updateByPrimaryKeySelective(Nowdrug record);

    int updateByPrimaryKey(Nowdrug record);
}