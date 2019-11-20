package com.lti.service;

import java.util.List;

import com.lti.model.Category;

public interface CategoryService {
	public Category addCategory(Category c);
	public Category updateCategory(Category c);
	public Category findById(int id);
	public List<Category> findAllCategories();
}
