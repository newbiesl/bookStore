package com.bookStore.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.domain.Category;
import com.bookStore.persistence.CategoryMapper;
import com.bookStore.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {  
	
	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public int saveCategory(Category Category) {
		return categoryMapper.insertCategory(Category);
	}

	@Override
	public List<Category> selectListCategory(Map<String, Object> params) {
		return categoryMapper.selectListCategory(params);
	}
}
