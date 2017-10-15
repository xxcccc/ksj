package com.codet.custom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.codet.custom.mapper.CustomMapper;
import com.codet.custom.pojo.Custom;
import com.codet.custom.service.CustomService;

public class CustomServiceImpl implements CustomService {

	@Autowired
	private CustomMapper customMapper;
	
	@Override
	public void customInsert(Custom custom) throws Exception {
		customMapper.insert(custom);
		
		
	}
	@Override
	public Custom findCustomById(String customid) throws Exception {
		
		return customMapper.selectByPrimaryKey(customid);
	}

	@Override
	public void updateCustom(String customid, Custom custom) throws Exception {
		// 更新商品信息
		custom.setCustomid("customid");
		customMapper.updateByPrimaryKey(custom);
		
	}

	
	

	

	

	
}
