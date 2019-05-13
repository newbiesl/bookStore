package com.bookStore.service;

import java.util.Map;

import com.bookStore.domain.User;

public interface UserService {
	
	public int saveUser(User user);
	
	/**
	 * 查询用户
	 * @param params
	 * @return
	 */
	User selectUser(Map<String, Object> params);
}
