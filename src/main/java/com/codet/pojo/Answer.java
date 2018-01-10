package com.codet.pojo;

import java.util.Date;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Answer {
	
	 private  Integer answerid;
	 
	 private String contentM;
	 
	 private  Date answerTimeDate;
	 
	 private  Integer messageid;
	 

	public Integer getAnswerid() {
		return answerid;
	}

	public void setAnswerid(Integer answerid) {
		this.answerid = answerid;
	}

	public String getContentM() {
		return contentM;
	}

	public void setContentM(String contentM) {
		this.contentM = contentM;
	}

	public Date getAnswerTimeDate() {
		return answerTimeDate;
	}

	public void setAnswerTimeDate(Date answerTimeDate) {
		this.answerTimeDate = answerTimeDate;
	}

	public Integer getMessageid() {
		return messageid;
	}

	public void setMessageid(Integer messageid) {
		this.messageid = messageid;
	}

	@Override
	public String toString() {
		return "Answer [answerid=" + answerid + ", contentM=" + contentM
				+ ", answerTimeDate=" + answerTimeDate + ", messageid="
				+ messageid + "]";
	}
	 
}
