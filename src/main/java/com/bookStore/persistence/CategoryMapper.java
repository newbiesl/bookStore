package com.bookStore.persistence;
import java.util.List;
import java.util.Map;

import com.bookStore.domain.Category;

public interface CategoryMapper {
	/**
	 * 新增类别
	 * @param record
	 * @return
	 */
	 int insertCategory(Category record);
	 
	 /**
	  * 根据条件查询类别
	  * @param params
	  * @return
	  */
	 List<Category> selectListCategory(Map<String, Object> params);
}
