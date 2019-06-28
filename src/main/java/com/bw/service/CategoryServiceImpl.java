package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Category;
import com.bw.mapper.CategoryMapper;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper cm;
	
	@Override
	public List list() {
		// TODO Auto-generated method stub
		return cm.list();
	}

	@Override
	public int insert(Category cate) {
		// TODO Auto-generated method stub
		return cm.insert(cate);
	}

}
