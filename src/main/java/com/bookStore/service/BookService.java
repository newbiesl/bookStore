package com.bookStore.service;

import java.util.Map;

import com.bookStore.domain.Book;

public interface BookService {
	
	public int saveBook(Book book);
	
	/**
	 * 查询书籍
	 * @param params
	 * @return
	 */
	Book selectBook(Map<String, Object> params);
}

