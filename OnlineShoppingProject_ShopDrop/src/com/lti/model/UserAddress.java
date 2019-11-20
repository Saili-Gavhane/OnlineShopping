package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class UserAddress {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int retailer_address_id;
	String addressline_1;
	String addressline_2;
	String city;
	String state;
	String country;
	int zipcode;
	 @ManyToOne
	    @JoinColumn(name="user_id", nullable=false)
	    private UserDetails user;

}
