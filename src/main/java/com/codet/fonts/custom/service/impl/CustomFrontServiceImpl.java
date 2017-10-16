package com.codet.fonts.custom.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codet.fonts.custom.mapper.CustomFrontMapper;
import com.codet.fonts.custom.service.CustomFrontService;
import com.codet.pojo.Custom;

public class CustomFrontServiceImpl implements CustomFrontService {

	@Autowired
	private CustomFrontMapper customMapper;

	@Override
	public Custom findCustomByCustomId(String customid) {
		
		Custom custom=new Custom();
		
		try {
			custom=customMapper.findCustomByCustomid(customid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return custom;
	}

	@Override
	public boolean login(Custom custom) {
		Custom custom2 =new Custom();
		try {
			 
			 custom2 =customMapper.findCustomByName(custom.getCustomname());
			 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if(custom2.getPassword().equals(custom.getPassword())){
			 return true;
		 }else{
			 return false;
		 }
	}

	@Override
	public Custom findCustomByName(String name) {
		Custom custom = new Custom();
		try {
			custom = customMapper.findCustomByName(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return custom;
	}


		

	
		
	
}
