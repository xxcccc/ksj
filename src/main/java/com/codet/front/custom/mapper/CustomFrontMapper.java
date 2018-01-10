package com.codet.front.custom.mapper;

import java.util.List;

import com.codet.pojo.Custom;
import com.codet.pojo.CustomExtend;

public interface CustomFrontMapper {

	// 通过主键id查找客户
	public CustomExtend findCustomByCustomid(String customid) throws Exception;
	public Custom findCustomByCustomId(String customid) throws Exception;

	// 通过客户姓名模糊查找客户
	public Custom findCustomByName(String name) throws Exception;
	
	//用户注册
	public void registerFrontCustom(CustomExtend customExtend)throws Exception;
	
	//查看用户信息
	public CustomExtend selectFrontCustom(String customid)throws Exception;
	
	//查看用户信息及留言
	public CustomExtend findCustomMessageResultMap(String customid)throws Exception;
	
	//修改用户信息
	public void updateCustom(CustomExtend customExtend) throws Exception;
}