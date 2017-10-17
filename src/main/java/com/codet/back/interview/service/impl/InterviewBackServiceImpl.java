package com.codet.back.interview.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codet.back.interview.mapper.InterviewMapper;
import com.codet.back.interview.service.InterviewBackService;
import com.codet.pojo.Custom;

public class InterviewBackServiceImpl implements InterviewBackService {

	@Autowired
	private InterviewMapper interviewMapper;
	
	@Override
	public List<Custom> findCustomByCustomidVague(String customid) {
		// TODO Auto-generated method stub
		List<Custom> customs=new ArrayList<>();
		try {
			customs=interviewMapper.findCustomByCustomidVague(customid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customs;
	}

}
