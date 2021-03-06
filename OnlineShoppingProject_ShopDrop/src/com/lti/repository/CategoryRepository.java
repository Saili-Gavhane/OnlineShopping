package com.lti.repository;

import java.util.List;

import com.lti.model.Admin;
import com.lti.model.Category;

public interface CategoryRepository {
	public Category addCategory(Category c);
	public Category updateCategory(Category c);
	public Category findById(int id);
	public List<Category> findAllCategories();
}
