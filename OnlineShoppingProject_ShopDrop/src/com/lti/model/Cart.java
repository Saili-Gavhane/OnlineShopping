package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int cart_id;
	int no_of_products;
	

}
