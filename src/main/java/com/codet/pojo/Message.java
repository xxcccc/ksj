package com.codet.pojo;

import java.util.Date;

public class Message {
	
	private Integer messageid;
	
	private String content;
	
	private Date messageTime;

	private String customid;

	public Integer getMessageid() {
		return messageid;
	}

	public void setMessageid(Integer messageid) {
		this.messageid = messageid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}

	public String getCustomid() {
		return customid;
	}

	public void setCustomid(String customid) {
		this.customid = customid;
	}

	@Override
	public String toString() {
		return "Message [messageid=" + messageid + ", content=" + content
				+ ", messageTime=" + messageTime + ", customid=" + customid
				+ "]";
	}

	
}
