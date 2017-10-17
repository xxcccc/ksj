package com.codet.back.interview.service;

import java.util.List;

import com.codet.pojo.Custom;

public interface InterviewBackService {
	public List<Custom> findCustomByCustomidVague(String customid);
}
