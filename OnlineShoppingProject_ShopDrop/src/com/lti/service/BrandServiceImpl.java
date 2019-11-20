package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Brand;
import com.lti.repository.BrandRepository;
@Service("brandservice")
public class BrandServiceImpl implements BrandService {

	@Autowired
	BrandRepository brandrepository;
	@Override
	public Brand addBrand(Brand b) {
		return brandrepository.addBrand(b);
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
