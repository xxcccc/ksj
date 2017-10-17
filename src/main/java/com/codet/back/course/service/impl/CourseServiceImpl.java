package com.codet.back.course.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.codet.back.course.mapper.CourseMapper;
import com.codet.back.course.service.CourseService;

import com.codet.pojo.Course;


public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseMapper courseMapper;
	
	@Override
	public void coursePublish(Course course) {
		try {
			courseMapper.coursePublish(course);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
