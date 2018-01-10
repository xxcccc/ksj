package com.codet.front.message.controller;


import java.util.Date;

import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codet.front.custom.mapper.CustomFrontMapper;
import com.codet.front.custom.service.CustomFrontService;
import com.codet.front.message.service.MessageFrontService;
import com.codet.pojo.Custom;
import com.codet.pojo.CustomExtend;
import com.codet.pojo.MessageExtend;
import com.codet.util.CommonConstant;
import com.mysql.fabric.xmlrpc.base.Data;


//插入留言
@Controller
@RequestMapping("/front/message")
public class MessageFrontController {
		@Autowired
		private MessageFrontService messageFrontService;
		
		@Autowired
		private CustomFrontService customFrontServiceService;
		
		
		@RequestMapping("insertFrontMassage")
		public String insertFrontMassage(MessageExtend messageExtend,HttpServletRequest request,Model model,HttpSession session)throws Exception{
			
			Custom custom2=(Custom) session.getAttribute("name");
			Date date=new Date();
			messageExtend.setMessageTime(date);
			System.out.println("----->s"+messageExtend.getContent());
			messageExtend.setCustomid(custom2.getCustomid());
			messageFrontService.insertFrontMessage(messageExtend);
			CustomExtend customExtendM=customFrontServiceService.findCustomMessageResultMap(custom2.getCustomid());
			CustomExtend customExtendC=customFrontServiceService.findCustomByCustomId(custom2.getCustomid());
			model.addAttribute(CommonConstant.Message_LIST, customExtendM);
			model.addAttribute(CommonConstant.CUSTOM_LISTC, customExtendC);
			model.addAttribute(CommonConstant.CUSTOM_CONTEXT, custom2);
			
			return "index2";
			
		}
		//删除留言信息
		@RequestMapping("deleteMessage")
		public String deleteMessage(Integer messageid,HttpServletRequest request,Model model,HttpSession session)throws Exception{		
			Custom custom2=(Custom) session.getAttribute("name");
			messageFrontService.deleteMessage(messageid);
			System.out.println("============");
			CustomExtend customExtendM=customFrontServiceService.findCustomMessageResultMap(custom2.getCustomid());
			CustomExtend customExtendC=customFrontServiceService.findCustomByCustomId(custom2.getCustomid());
			model.addAttribute(CommonConstant.Message_LIST, customExtendM);
			model.addAttribute(CommonConstant.CUSTOM_LISTC, customExtendC);
			model.addAttribute(CommonConstant.CUSTOM_CONTEXT, custom2);
			return "index2";
		}
}
