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
	
	//榛樿鎼滅储鐨勭被鍨嬩负id,妯＄硦鎼滅储鍐呭涓虹┖
	private String searchType="id";
	private String searchValue="";
	
	@RequestMapping("loginCustom")
	public String customLogin(Custom custom,Model model) throws Exception{
		
		
		if(customFrontServiceService.login(custom)){
			Custom custom2 = customFrontServiceService.findCustomByName(custom.getCustomname());
			
			model.addAttribute(CommonConstant.CUSTOM_CONTEXT, custom2);
			return "page/front/shop/index";
		}else{
			String message ="鐢ㄦ埛鍚嶆垨鑰呭瘑鐮侀敊璇�";
			model.addAttribute(CommonConstant.LOGIN_MESSAGE,message);
			//return null;
			return "redirect:../../page/front/shop/Login.jsp";
		}
		
		
	}
	
	
	
	
	
	
}
