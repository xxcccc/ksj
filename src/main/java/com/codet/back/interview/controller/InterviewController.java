package com.codet.back.interview.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codet.back.interview.service.InterviewBackService;
import com.codet.pojo.Custom;

@Controller
@RequestMapping("/back/interview")
public class InterviewController {
	
	@Autowired
	private InterviewBackService interviewBackService;

	@RequestMapping("/findCustomByCustomidVague")
	public @ResponseBody List<Custom> findCustomByCustomidVague(String customid) throws Exception{
		List<Custom> customs=new ArrayList<>();
		customs=interviewBackService.findCustomByCustomidVague(customid);
		return customs;
	}

}
