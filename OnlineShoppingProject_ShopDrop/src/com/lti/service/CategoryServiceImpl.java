package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Category;
import com.lti.repository.CategoryRepository;
@Service("categoryservice")
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryrepository;
	@Override
	public Category addCategory(Category c) {
		
		return categoryrepository.addCategory(c);
	}

	@Override
	public Category updateCategory(Category c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> findAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
