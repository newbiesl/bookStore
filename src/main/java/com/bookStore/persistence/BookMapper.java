package com.bookStore.persistence;

import java.util.Map;

import com.bookStore.domain.Book;

public interface BookMapper {
	/**
	 * 新增书籍
	 * @param record
	 * @return
	 */
	 int insertBook(Book record);
	 
	 /**
	  * 根据条件查询书单
	  * @param params
	  * @return
	  */
	 Book selectBook(Map<String, Object> params);
}

	
