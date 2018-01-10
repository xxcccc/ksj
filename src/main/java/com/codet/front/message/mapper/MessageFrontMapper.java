package com.codet.front.message.mapper;

import com.codet.pojo.MessageExtend;

public interface MessageFrontMapper {
		//插入留言
	public void insertFrontMessage(MessageExtend messageExtend)throws Exception;
	
	//删除留言
	public void deteleMessage(Integer messageid)throws Exception;
}
