package com.codet.front.item.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codet.front.item.service.ItemFrontService;
import com.codet.pojo.ItemsQueryPojo;
import com.codet.util.CommonConstant;


@Controller
@RequestMapping("/front/item")
public class ItemFrontController {

	@Autowired
	private ItemFrontService itemFrontService;
	//显示商品搜索列表
	
	@RequestMapping("listItem")
	 public String listItem(Model model ,String start,String pageSize){
		List<ItemsQueryPojo> items = new ArrayList<>();
		items=itemFrontService.itemFindAll(0, 4);
		
		System.out.println("------------->"+items.size());
		model.addAttribute(CommonConstant.ITEM_LIST,items);
		
		return "page/front/shop/Item_List";
	}
}
