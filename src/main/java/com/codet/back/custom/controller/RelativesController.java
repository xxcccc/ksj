package com.codet.back.custom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codet.back.custom.mapper.RelativesMapper;
import com.codet.back.custom.service.RelativesBackService;
import com.codet.pojo.RelativesExtend;


@Controller
@RequestMapping("/back/custom")
public class RelativesController {
	@Autowired
	private RelativesBackService relativesBackService;
	@Autowired
	private RelativesMapper relativesMapper;
	//添加亲属信息
	@RequestMapping("insertRelatives")
	public String insertRelatives(RelativesExtend relativesExtend,HttpServletRequest request)throws Exception{
		relativesMapper.insertRelatives(relativesExtend);
		
		return "page/back/custom_info/success";
	}
	
}
