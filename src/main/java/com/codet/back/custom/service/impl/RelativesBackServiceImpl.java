package com.codet.back.custom.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.codet.back.custom.mapper.RelativesMapper;
import com.codet.back.custom.service.RelativesBackService;
import com.codet.pojo.RelativesExtend;

public class RelativesBackServiceImpl implements RelativesBackService {
	@Autowired
	private RelativesMapper relativesMapper;
	@Override
	public void insertRelatives(RelativesExtend relativesExtend) {
		try {
			relativesMapper.insertRelatives(relativesExtend);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	

}
