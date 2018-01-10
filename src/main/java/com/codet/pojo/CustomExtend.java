package com.codet.pojo;

import java.util.List;

/**
 * 
 * 客户的扩展类
 * @author ran
 *
 */
public class CustomExtend extends Custom {
	private List<Message> listMessage;

	public List<Message> getListMessage() {
		return listMessage;
	}

	public void setListMessage(List<Message> listMessage) {
		this.listMessage = listMessage;
	}
	
}
