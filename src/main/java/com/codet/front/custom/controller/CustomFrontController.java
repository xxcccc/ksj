package com.codet.front.custom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.codet.front.custom.service.CustomFrontService;
import com.codet.pojo.Custom;
import com.codet.util.CommonConstant;

@Controller
@RequestMapping("/front/custom")
public class CustomFrontController {

	@Autowired
	private CustomFrontService customFrontServiceService;
	
	//默认搜索的类型为id,模糊搜索内容为空
	private String searchType="id";
	private String searchValue="";
	
	@RequestMapping("loginCustom")
	public String customLogin(Custom custom,Model model) throws Exception{
		
		
		if(customFrontServiceService.login(custom)){
			Custom custom2 = customFrontServiceService.findCustomByName(custom.getCustomname());
			
			model.addAttribute("custom", custom2);
		}
		
		return "page/front/shop/index";
	}
	
	
	
	
	
	
}
