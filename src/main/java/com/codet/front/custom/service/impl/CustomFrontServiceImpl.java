package com.codet.front.custom.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.codet.front.custom.mapper.CustomFrontMapper;
import com.codet.front.custom.service.CustomFrontService;
import com.codet.pojo.Custom;
import com.codet.pojo.CustomExtend;
import com.codet.util.IdUtil;

public class CustomFrontServiceImpl implements CustomFrontService {

	@Autowired
	private CustomFrontMapper customFrontMapper;

	@Override
	public CustomExtend findCustomByCustomId(String customid) {
		
		CustomExtend customExCustom=new CustomExtend();
		
		try {
			customExCustom=customFrontMapper.findCustomByCustomid(customid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return customExCustom;
	}

	@Override
	public boolean login(Custom custom) {
		Custom custom2 =new Custom();
		try {
			 
			 custom2 =customFrontMapper.findCustomByName(custom.getCustomname());
			 
			
		} catch (Exception e) {
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
			e.printStackTrace();
		}
		return custom;
	}

	@Override
	public void registerFrontCustom(CustomExtend customExtend) {
		// 用户注册
		try {
			customFrontMapper.registerFrontCustom(customExtend);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public CustomExtend selectFrontCustom(String customid) {
		CustomExtend customExtend = new CustomExtend();
		try {
			customExtend = customFrontMapper.selectFrontCustom(customid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customExtend;
	}

	//查询用户信息及留言
	@Override
	public CustomExtend findCustomMessageResultMap(String customid) {
		CustomExtend customExtend=new CustomExtend();
		try {
			customExtend=customFrontMapper.findCustomMessageResultMap(customid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customExtend;
	}

	//修改用户信息
	@Override
	public void updateCustom(CustomExtend customExtend) {
		try {

			CustomExtend customExtend2=customFrontMapper.findCustomByCustomid(customExtend.getCustomid());
			if (customExtend.getPic()==null||customExtend.getPic().equals("")) {
				customExtend.setPic(customExtend2.getPic());
			}
			if (customExtend2.getPassword()!=customExtend.getPassword()) {
				customExtend.setPassword(IdUtil.md5(customExtend.getPassword()));
			}
			
			customExtend.setPassword(customExtend2.getPassword());
			customFrontMapper.updateCustom(customExtend);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
}
