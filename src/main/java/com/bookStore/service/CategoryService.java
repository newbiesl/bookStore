package com.bookStore.service;

import java.util.List;
import java.util.Map;

import com.bookStore.domain.Category;

public interface CategoryService {
	
	public int saveCategory(Category Category);
	
	/**
	 * 查询类别
	 * @param params
	 * @return
	 */
	List<Category> selectListCategory(Map<String, Object> params);
	
}
