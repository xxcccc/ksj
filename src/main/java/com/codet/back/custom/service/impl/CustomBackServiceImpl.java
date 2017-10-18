package com.codet.back.custom.service.impl;

import java.util.ArrayList;


import java.util.List;

import javax.enterprise.inject.New;

import org.springframework.beans.factory.annotation.Autowired;

import com.codet.back.custom.mapper.CustomMapper;
import com.codet.back.custom.service.CustomBackService;
import com.codet.pojo.Custom;
import com.codet.pojo.CustomExtend;
import com.codet.pojo.CustomQueryPojo;

public class CustomBackServiceImpl implements CustomBackService {

	@Autowired
	private CustomMapper customMapper;

	@Override
	public CustomExtend findCustomByCustomId(String customid) {
		
		CustomExtend customExtend=new CustomExtend();
		
		try {
			customExtend=customMapper.findCustomByCustomid(customid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return customExtend;
	}

	@Override
	public List<CustomExtend> findCustomByName(String name) {
		
		List<CustomExtend> customs=new ArrayList<>();
		
		try {
			customs=customMapper.findCustomByName(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customs;
	}

	
	@Override
	public void updateCustom(CustomExtend customExtend) {
		
		try {
			customMapper.updateCustom(customExtend);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertCustom(CustomExtend customExtend) {
		try {
			customMapper.insertCustom(customExtend);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteCustomByCustomid(String customid) {
		try {
			customMapper.deleteCustomByCustomid(customid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public CustomExtend selectCustom(String customid) {
		CustomExtend customExtend=new CustomExtend();
		try {
			customExtend=customMapper.selectCustom(customid);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return customExtend;
	}

	
}
