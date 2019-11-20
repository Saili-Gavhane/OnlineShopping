package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Brand;

@Repository("brandrepository")
public class BrandRepositoryImpl implements BrandRepository{
	EntityManager em;
	@Override
	@Transactional
	public Brand addBrand(Brand b) {
		em.persist(b);
		return b;
	}

	@Override
	public Brand updateBrand(Brand b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Brand findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Brand> findAllBrand() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
