package com.codet.back.user.controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codet.back.user.service.UserService;
import com.codet.pojo.Custom;
import com.codet.pojo.User;
import com.codet.util.CommonConstant;

@Controller
@RequestMapping("/back/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("login")
	public String login(User user,HttpSession session,Model model) throws Exception{
		
		boolean flag=false;
		
		flag=userService.login(user);
		
		if(flag){
			
			session.setAttribute(CommonConstant.USER_CONTEXT, user);
			return "page/back/default_main";
			
		} 
		System.out.println("cuo+++++++++++++++++++++++++++++++s");
		return "admin_login";
		
	}
	
	@RequestMapping("forward")
	public String forward(Model model) throws Exception{
		
		model.addAttribute("message","跳转成功");
		model.addAttribute("url", "/page/back/user/index.jsp");
		return "forward";
	}
}
