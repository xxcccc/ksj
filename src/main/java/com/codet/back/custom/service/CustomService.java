package com.codet.back.custom.service;

import java.util.List;

import com.codet.pojo.Custom;
import com.codet.pojo.CustomExtend;
import com.codet.pojo.CustomQueryPojo;

public interface CustomService {

	//通过客户id查找客户
	public CustomExtend findCustomByCustomId(String customid) ;
	
	//通过客户姓名name模糊查找客户
	public List<CustomExtend> findCustomByName(String name);
	
	//添加客户
	public void insertCustom(CustomExtend customExtend);
	
	//修改客户信息
	public void updateCustom(CustomExtend customExtend);
	//删除客户信息
	public void deleteCustomByCustomid(String customid);
	
	//通过ID查看客户详情
	public CustomExtend selectCustom(String customid);
}
