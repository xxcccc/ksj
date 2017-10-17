package com.codet.back.healtrecords.service;

import com.codet.pojo.HealtrecordsExtend;

public interface HealtrecordsService {

	/* 添加客户健康信息 */
	public void InsertHealtrecordsExtend(HealtrecordsExtend healtrecordsExtend)
			throws Exception;

}
