package com.lti.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int user_id;
	String first_name;
	String last_name;
	String user_email;
	String user_password;
	String user_mobileno;
	@OneToMany(mappedBy="user")
    private Set<UserAddress> useraddress;
	
	
	
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetails(int user_id, String first_name, String last_name, String user_email, String user_password,
			String user_mobileno, Set<UserAddress> useraddress) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_mobileno = user_mobileno;
		this.useraddress = useraddress;
		
	}

	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_mobileno() {
		return user_mobileno;
	}
	public void setUser_mobileno(String user_mobileno) {
		this.user_mobileno = user_mobileno;
	}

	public Set<UserAddress> getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(Set<UserAddress> useraddress) {
		this.useraddress = useraddress;
	}

	




}
