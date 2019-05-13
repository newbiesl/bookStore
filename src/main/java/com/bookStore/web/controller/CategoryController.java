package com.bookStore.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookStore.domain.Category;
import com.bookStore.service.CategoryService;

@Controller
@RequestMapping("class")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@ResponseBody
	@RequestMapping("/list")
	public Map<String, Object> listClass(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> rtn = new HashMap<String, Object>();
		// 查询分类
		List<Category> categoryList = this.categoryService.selectListCategory(null);
		rtn.put("classList", categoryList);
		return rtn;
	}
}