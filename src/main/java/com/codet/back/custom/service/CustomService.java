package com.codet.back.custom.service;

import java.util.List;

import com.codet.pojo.Custom;

public interface CustomService {

	//通过客户id查找客户
	public Custom findCustomByCustomId(String customid) ;
	
	//通过客户姓名name模糊查找客户
	public List<Custom> findCustomByName(String name);
	
	//添加客户
	public void insertCustom(Custom custom);
	
	//修改客户信息
	public void updateCustom(Custom custom);
	//删除客户信息
	public void deleteCustomByCustomid(String customid);
	
}
