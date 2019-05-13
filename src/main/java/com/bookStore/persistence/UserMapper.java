package com.bookStore.persistence;

import java.util.Map;

import com.bookStore.domain.User;

public interface UserMapper {
	/**
	 * 新增用户
	 * @param record
	 * @return
	 */
	 int insertUser(User record);
	 
	 /**
	  * 根据条件查询用户
	  * @param params
	  * @return
	  */
	 User selectUser(Map<String, Object> params);
}
