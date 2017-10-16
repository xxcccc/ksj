package com.codet.fonts.custom.service;



import com.codet.pojo.Custom;

public interface CustomFrontService {

	//通过客户id查找客户
	public Custom findCustomByCustomId(String customid) ;
	
	//通过客户姓名name查找客户
	public Custom findCustomByName(String name);

	//登录功能
	public boolean login(Custom custom);
		
}
