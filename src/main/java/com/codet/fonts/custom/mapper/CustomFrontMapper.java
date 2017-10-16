package com.codet.fonts.custom.mapper;

import java.util.List;

import com.codet.pojo.Custom;

public interface CustomFrontMapper {

	// 通过主键id查找客户
	public Custom findCustomByCustomid(String customid) throws Exception;

	// 通过客户姓名模糊查找客户
	public Custom findCustomByName(String name) throws Exception;

}