package com.lti.repository;

import java.util.List;

import com.lti.model.Brand;

public interface BrandRepository {
	public Brand addBrand(Brand b);
	public Brand updateBrand(Brand b);
	public Brand findById(int id);
	public List<Brand> findAllBrand();
}
