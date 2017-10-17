package com.codet.front.item.service;

import java.util.List;

import com.codet.pojo.Custom;
import com.codet.pojo.Item;

public interface ItemFrontService {

	//通过商品名查找客户
		public List<Item> findItemByItemName(String itemName) ;
		
}
