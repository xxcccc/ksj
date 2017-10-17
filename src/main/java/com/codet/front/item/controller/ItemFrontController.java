package com.codet.front.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/front/item")
public class ItemFrontController {

	
	//显示商品搜索列表
	
	@RequestMapping("listItem")
	 public String listItem(Model model ,String like){
		return like;
	}
}
