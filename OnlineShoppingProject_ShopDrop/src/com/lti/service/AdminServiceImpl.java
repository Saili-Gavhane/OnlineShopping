package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Admin;
import com.lti.repository.AdminRepository;
@Service("adminservice")
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminrepository;
	@Override
	public Admin addUser(Admin a) {
		
		return adminrepository.addUser(a);
	}

	@Override
	public Admin updateUser(Admin a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
