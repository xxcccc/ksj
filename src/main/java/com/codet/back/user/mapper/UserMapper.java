package com.codet.back.user.mapper;

import java.util.List;

import com.codet.pojo.Custom;
import com.codet.pojo.User;

public interface UserMapper {
    
    public User selectUserByUsername(User user) throws Exception;

	public List<Custom> selectCustomAll() throws Exception;
    
}
