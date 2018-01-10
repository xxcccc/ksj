package com.codet.front.answer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.codet.front.answer.mapper.AnswerFrontMapper;
import com.codet.front.answer.service.AnswerFrontService;
import com.codet.pojo.AnswerExtend;

public class AnswerFrontServiceImpl implements AnswerFrontService {
	@Autowired
	private AnswerFrontMapper answerFrontMapper;
	@Override
	public void insertFrontAnswer(AnswerExtend answerExtend) {
		// 插入回复
		try {
			answerFrontMapper.insertFrontAnswer(answerExtend);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteFrontAnswer(Integer answerid) {
		// 删除回复
		try {
			answerFrontMapper.deleteFrontAnswer(answerid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
