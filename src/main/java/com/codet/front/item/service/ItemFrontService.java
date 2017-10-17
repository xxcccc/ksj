package com.codet.front.item.service;

import java.util.List;

import com.codet.pojo.Item;
import com.codet.pojo.ItemsQueryPojo;

public interface ItemFrontService {

	//通过商品名查找
		public List<Item> findItemByName(String itemName) ;
	//分页显示
		public List<ItemsQueryPojo> itemFindAll(int start, int pageSize);
}
