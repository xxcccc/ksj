package com.codet.back.custom.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codet.back.custom.mapper.CustomMapper;
import com.codet.back.custom.service.CustomService;
import com.codet.pojo.Custom;

public class CustomServiceImpl implements CustomService {

	@Autowired
	private CustomMapper customMapper;

	@Override
	public Custom findCustomByCustomId(String customid) {
		
		Custom custom=new Custom();
		
		try {
			custom=customMapper.findCustomByCustomid(customid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return custom;
	}

	@Override
	public List<Custom> findCustomByName(String name) {
		
		List<Custom> customs=new ArrayList<>();
		
		try {
			customs=customMapper.findCustomByName(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customs;
	}

	
	@Override
	public void updateCustom(Custom custom) {
		
		try {
			customMapper.updateCustom(custom);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertCustom(Custom custom) {
		try {
			customMapper.insertCustom(custom);
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

	
}
