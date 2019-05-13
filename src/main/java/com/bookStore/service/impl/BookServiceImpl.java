package com.bookStore.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.domain.Book;
import com.bookStore.persistence.BookMapper;
import com.bookStore.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {  
	
	@Autowired
	private BookMapper bookMapper;

	@Override
	public int saveBook(Book book) {
		return bookMapper.insertBook(book);
	}

	@Override
	public Book selectBook(Map<String, Object> params) {
		return bookMapper.selectBook(params);
	}
}
