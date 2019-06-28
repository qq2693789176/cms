package com.bw.mapper;

import java.util.List;

import com.bw.bean.Category;

public interface CategoryMapper {

	List list();
	
	int insert(Category cate);
}
