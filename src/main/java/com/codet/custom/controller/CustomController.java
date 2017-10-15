package com.codet.custom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.codet.custom.pojo.Custom;
import com.codet.custom.service.CustomService;
import com.codet.user.service.UserService;

@Controller
@RequestMapping("/custom")
public class CustomController {

	
	@Autowired
	private CustomService customService;
	
	
	@RequestMapping("customInsert")
	public String customInsert(Custom custom ) throws Exception{

		custom.setCustomid("0225");
	
		customService.customInsert(custom);
		
		return "page/user/custom_list";
	}
	//商品修改信息修改页面显示
		@RequestMapping("custom_update")
		public ModelAndView custom_update(String customid)throws Exception{
			
			Custom custom=customService.findCustomById(customid);
			ModelAndView modelAndView=new ModelAndView();
			modelAndView.addObject("custom", custom);
			modelAndView.setViewName("page/user/custom_update");
			return modelAndView;
		}
		//商品信息修改提交
		@RequestMapping("custom_updateSubmit")
		public ModelAndView custom_updateSubmit(Custom custom)throws Exception{
			customService.updateCustom(custom.getCustomid(), custom);
			ModelAndView modelAndView=new ModelAndView();
			modelAndView.setViewName("success");
			return modelAndView;
		}
}
