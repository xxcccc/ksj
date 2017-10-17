package com.codet.front.custom.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codet.front.custom.mapper.CustomFrontMapper;
import com.codet.front.custom.service.CustomFrontService;
import com.codet.pojo.Custom;

public class CustomFrontServiceImpl implements CustomFrontService {

	@Autowired
	private CustomFrontMapper customFrontMapper;

	@Override
	public Custom findCustomByCustomId(String customid) {
		
		Custom custom=new Custom();
		
		try {
			custom=customFrontMapper.findCustomByCustomid(customid);
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
			 
			 custom2 =customFrontMapper.findCustomByName(custom.getCustomname());
			 
			
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
			custom = customFrontMapper.findCustomByName(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return custom;
	}


		

	
		
	
}
