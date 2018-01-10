package com.codet.front.custom.service;



import com.codet.pojo.Custom;
import com.codet.pojo.CustomExtend;

public interface CustomFrontService {

	//通过客户id查找客户
	public CustomExtend findCustomByCustomId(String customid) ;
	
	//通过客户姓名name查找客户
	public Custom findCustomByName(String name);

	//登录功能
	public boolean login(Custom custom);
	
	//注册
	public void registerFrontCustom(CustomExtend customExtend);
	
	//通过ID查看客户详情
	public CustomExtend selectFrontCustom(String customid);
		
	//查询客户表和客户亲属表
	public CustomExtend findCustomMessageResultMap(String customid);
	
	//修改用户信息
	public void updateCustom(CustomExtend customExtend);
		
}
