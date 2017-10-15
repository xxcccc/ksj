package com.codet.custom.service;

import com.codet.custom.pojo.Custom;

public interface CustomService {

	public void customInsert(Custom custom) throws Exception;
	//根据客户ID查询客户信息
		public Custom findCustomById(String customid)throws Exception;
		//修改客户信息
		public void updateCustom(String customid,Custom custom)throws Exception;
}
