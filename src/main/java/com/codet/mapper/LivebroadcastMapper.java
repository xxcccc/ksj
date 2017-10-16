package com.codet.mapper;

import com.codet.pojo.Livebroadcast;
import com.codet.pojo.LivebroadcastExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LivebroadcastMapper {
    int countByExample(LivebroadcastExample example);

    int deleteByExample(LivebroadcastExample example);

    int deleteByPrimaryKey(Integer livebroadcastid);

    int insert(Livebroadcast record);

    int insertSelective(Livebroadcast record);

    List<Livebroadcast> selectByExample(LivebroadcastExample example);

    Livebroadcast selectByPrimaryKey(Integer livebroadcastid);

    int updateByExampleSelective(@Param("record") Livebroadcast record, @Param("example") LivebroadcastExample example);

    int updateByExample(@Param("record") Livebroadcast record, @Param("example") LivebroadcastExample example);

    int updateByPrimaryKeySelective(Livebroadcast record);

    int updateByPrimaryKey(Livebroadcast record);
}