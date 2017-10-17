package com.codet.front.item.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.codet.front.item.mapper.ItemFrontMapper;
import com.codet.front.item.service.ItemFrontService;
import com.codet.pojo.Item;
import com.codet.pojo.ItemsQueryPojo;

public class ItemFrontServiceImpl implements ItemFrontService {

	@Autowired
	private ItemFrontMapper itemFrontMapper;


	@Override
	public List<Item> findItemByName(String itemName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemsQueryPojo> itemFindAll(int start, int pageSize) {
		Map<String,Integer> map = new  HashMap<>();
		map.put("start", start);
		map.put("pageSize", pageSize);
		List<ItemsQueryPojo> items= new ArrayList<>();
		items= itemFrontMapper.itemFindAll(map);
		System.out.println("==========>"+items.size());
		return items;
	}


	
}
