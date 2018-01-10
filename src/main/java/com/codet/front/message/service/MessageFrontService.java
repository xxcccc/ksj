package com.codet.front.message.service;

import com.codet.pojo.MessageExtend;

public interface MessageFrontService {
	//插入留言
	public void insertFrontMessage(MessageExtend messageExtend);
	
	//删除留言
	public void deleteMessage(Integer messageid);
}
