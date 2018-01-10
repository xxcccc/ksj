package com.codet.front.answer.mapper;

import com.codet.pojo.AnswerExtend;

public interface AnswerFrontMapper {
	//插入回复
	public void insertFrontAnswer(AnswerExtend answerExtend)throws Exception; 
	
	//删除回复
	public void deleteFrontAnswer(Integer answerid)throws Exception;
}
