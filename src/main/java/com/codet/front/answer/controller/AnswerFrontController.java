package com.codet.front.answer.controller;

import java.util.Date;

import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codet.front.answer.service.AnswerFrontService;
import com.codet.front.custom.service.CustomFrontService;
import com.codet.pojo.AnswerExtend;
import com.codet.pojo.Custom;
import com.codet.pojo.CustomExtend;
import com.codet.util.CommonConstant;


@Controller
@RequestMapping("/front/answer")
public class AnswerFrontController {
	@Autowired
	private AnswerFrontService answerFrontService;
	@Autowired
	private CustomFrontService customFrontServiceService;
	//插入回复
	@RequestMapping("insertFrontAnswer")
	public String insertFrontAnswer(AnswerExtend answerExtend,HttpServletRequest request,HttpSession session,Model model)throws Exception{
		Custom custom2=(Custom) session.getAttribute("name");
		Date date=new Date();
		answerExtend.setAnswerTimeDate(date);
		answerFrontService.insertFrontAnswer(answerExtend);
		CustomExtend customExtendM=customFrontServiceService.findCustomMessageResultMap(custom2.getCustomid());
		CustomExtend customExtendC=customFrontServiceService.findCustomByCustomId(custom2.getCustomid());
		model.addAttribute(CommonConstant.Message_LIST, customExtendM);
		model.addAttribute(CommonConstant.CUSTOM_LISTC, customExtendC);
		model.addAttribute(CommonConstant.CUSTOM_CONTEXT, custom2);
		return "index2";
	}
	
	//删除回复
	@RequestMapping("deteleFrontAnswer")
	public String deteleFrontAnswer(Integer answerid)throws Exception{
		answerFrontService.deleteFrontAnswer(answerid);
		return "";
	}
}
