package com.codet.back.custom.mapper;

import java.util.List;

import com.codet.pojo.Custom;
import com.codet.pojo.CustomExtend;
import com.codet.pojo.CustomQueryPojo;

public interface CustomMapper {

	//增加一位客户
	public void insertCustom(CustomExtend customExtend) throws Exception;
	
	//通过主键id删除客户
	public void deleteCustomByCustomid(String customid) throws Exception;
	
	//修改客户信息
	public void updateCustom(CustomExtend customExtend) throws Exception;
	
	//通过主键id查找客户
	public CustomExtend findCustomByCustomid(String customid) throws Exception;
	
	//通过客户姓名模糊查找客户
	public List<CustomExtend> findCustomByName(String name) throws Exception;
	//通过ID查看客户详情
	public CustomExtend selectCustom(String customid)throws Exception;
	
}