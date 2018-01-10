package com.codet.front.message.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.codet.front.message.mapper.MessageFrontMapper;
import com.codet.front.message.service.MessageFrontService;
import com.codet.pojo.MessageExtend;

public class MessageFrontServiceImpl implements MessageFrontService{
	
	@Autowired
	private MessageFrontMapper messageFrontMapper;

	@Override
	public void insertFrontMessage(MessageExtend messageExtend) {
		// 插入留言
		try {
			messageFrontMapper.insertFrontMessage(messageExtend);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteMessage(Integer messageid) {
		// 删除留言
		try {
			messageFrontMapper.deteleMessage(messageid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
