package com.codet.back.custom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.codet.back.custom.service.CustomService;
import com.codet.pojo.Custom;
import com.codet.util.CommonConstant;

@Controller
@RequestMapping("/back/custom")
public class CustomController {

	@Autowired
	private CustomService customService;
	
	//默认搜索的类型为id,模糊搜索内容为空
	private String searchType="id";
	private String searchValue="";
	
	@RequestMapping("customList")
	public String customList(String searchType,String searchValue,Model model) throws Exception{
		
		List<Custom> customList=new ArrayList<>();
		
		if(searchType!=null&&searchType.equals("id")){
			Custom custom=customService.findCustomByCustomId(searchValue);
			customList.add(custom);
		} else{
			customList=customService.findCustomByName("");
		} 
		
		model.addAttribute(CommonConstant.CUSTOM_LIST, customList);
		
		return "page/back/custom_info/custom_list";
	}
	
	@RequestMapping("insertCustom")
	public String insertCustom(Custom custom) throws Exception {

		custom.setCustomid("0225");

		customService.insertCustom(custom);

		return "page/user/custom_list";
	}

	// 商品修改信息修改页面显示
	@RequestMapping("customUpdate")
	public String custom_update(String customid,Model model) throws Exception {

		
		Custom customUpdate = customService.findCustomByCustomId(customid);
		model.addAttribute(CommonConstant.CUSTOM_UPDATE, customUpdate);
		
		return "page/back/custom/custom_update";
	}

	// 商品信息修改提交
	@RequestMapping("custom_updateSubmit")
	public ModelAndView custom_updateSubmit(Custom custom) throws Exception {
		customService.updateCustom(custom);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("success");
		return modelAndView;
	}
}
