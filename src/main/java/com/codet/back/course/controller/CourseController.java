package com.codet.back.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codet.back.course.service.CourseService;
import com.codet.pojo.Course;



@Controller
@RequestMapping("/back/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	
	@RequestMapping("coursePublish")
	public String coursePublish(Course course) throws Exception {
		courseService.coursePublish(course);
		
		return "page/back/custom_info/custom_list";
	}

}
