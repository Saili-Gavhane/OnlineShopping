package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Admin;
import com.lti.model.Category;

@Repository("categoryrepository")
public class CategoryRepositoryImpl implements CategoryRepository{
	@PersistenceContext
    EntityManager em;
	@Override
	@Transactional
	public Category addCategory(Category c) {
		em.persist(c);
		return c;
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
