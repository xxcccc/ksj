package com.codet.back.user.service;

import java.util.List;

import com.codet.pojo.Custom;
import com.codet.pojo.User;

public interface UserService {
	
	public boolean login(User user) throws Exception;
	
	public void insertUser(User user) throws Exception;
	
	public void updateUser(User user) throws Exception;
	
	public void delete(int id) throws Exception;

	public List<Custom> selectCustomAll() throws Exception;
}
