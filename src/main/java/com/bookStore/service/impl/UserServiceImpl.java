package com.bookStore.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.domain.User;
import com.bookStore.persistence.UserMapper;
import com.bookStore.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {  
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public int saveUser(User user) {
		return userMapper.insertUser(user);
	}

	@Override
	public User selectUser(Map<String, Object> params) {
		return userMapper.selectUser(params);
	}
}
