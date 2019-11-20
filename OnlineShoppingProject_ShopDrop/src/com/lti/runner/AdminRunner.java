package com.lti.runner;



import com.lti.model.Admin;

import com.lti.service.AdminServiceImpl;

public class AdminRunner {

	public static void main(String[] args) {
		
		AdminServiceImpl service = new AdminServiceImpl();
		Admin a=new Admin();
		a.setAdmin_name("sayali");
		a.setAdmin_email("sayali@gmail.com");
		a.setAdmin_password("1234");
		Admin a1 = service.addUser(a);
		if(a1!=null)
		{
			System.out.println("added");
		}

	}

}
