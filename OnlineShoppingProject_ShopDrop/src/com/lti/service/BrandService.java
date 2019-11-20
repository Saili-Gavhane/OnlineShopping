package com.lti.service;

import java.util.List;

import com.lti.model.Brand;

public interface BrandService {
	public Brand addBrand(Brand b);
	public Brand updateBrand(Brand b);
	public Brand findById(int id);
	public List<Brand> findAllBrand();
}
