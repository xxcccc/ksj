package com.codet.util;


import org.springframework.beans.factory.annotation.Autowired;

import com.codet.user.mapper.UserMapper;
import com.codet.user.pojo.User;

public class TestDBServiceImpl {

	@Autowired
	private UserMapper userMapper;
	
	public static void main(String[] args) throws Exception {
		TestDBServiceImpl testDBServiceImpl=new TestDBServiceImpl();
		
		User user=new User();
		user.setUsername("admin");
		
		User user2=testDBServiceImpl.getUserMapper().selectUserByUsername(user);
		
		System.out.println(user2);
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	
}
