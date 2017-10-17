package com.codet.back.healtrecords.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.codet.back.healtrecords.mapper.HealtrecordsMapper;
import com.codet.back.healtrecords.service.HealtrecordsService;
import com.codet.pojo.HealtrecordsExtend;

public class HealtrecordsServiceImpl implements HealtrecordsService {

	@Autowired
	private HealtrecordsMapper healtrecordsMapper;

	/* 添加客户健康信息 */
	@Override
	public void InsertHealtrecordsExtend(HealtrecordsExtend healtrecordsExtend)
			throws Exception {
		// TODO Auto-generated method stub
		try {
			healtrecordsMapper.InsertHealtrecordsExtend(healtrecordsExtend);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
