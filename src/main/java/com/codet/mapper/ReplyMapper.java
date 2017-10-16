package com.codet.mapper;

import com.codet.pojo.Reply;
import com.codet.pojo.ReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplyMapper {
    int countByExample(ReplyExample example);

    int deleteByExample(ReplyExample example);

    int deleteByPrimaryKey(Integer replayid);

    int insert(Reply record);

    int insertSelective(Reply record);

    List<Reply> selectByExample(ReplyExample example);

    Reply selectByPrimaryKey(Integer replayid);

    int updateByExampleSelective(@Param("record") Reply record, @Param("example") ReplyExample example);

    int updateByExample(@Param("record") Reply record, @Param("example") ReplyExample example);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);
}