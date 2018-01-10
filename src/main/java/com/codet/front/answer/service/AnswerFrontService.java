package com.codet.front.answer.service;

import com.codet.pojo.AnswerExtend;

public interface AnswerFrontService {
	//插入回复
	public void insertFrontAnswer(AnswerExtend answerExtend);
	
	//删除回复
	public void deleteFrontAnswer(Integer answerid);
	
	
}
