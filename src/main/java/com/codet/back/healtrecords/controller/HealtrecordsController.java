package com.codet.back.healtrecords.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codet.back.healtrecords.service.HealtrecordsService;
import com.codet.pojo.HealtrecordsExtend;

@Controller
@RequestMapping("/back/healtrecords")
public class HealtrecordsController {

	@Autowired
	private HealtrecordsService healtrecordsService;

	/* 添加客户健康信息 */
	@RequestMapping("InsertHealtrecordsExtend")
	public String InsertHealtrecordsExtend(HealtrecordsExtend healtrecordsExtend)
			throws Exception {
		healtrecordsService.InsertHealtrecordsExtend(healtrecordsExtend);
		return "/page/back/healthRecords/healthRecords_list.jsp";
	}

}
