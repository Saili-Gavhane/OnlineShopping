package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Brand {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int brand_id;
	String brand_name;
	
	@OneToOne(mappedBy="brand")
	private Retailer retailer;
	
	@OneToOne(mappedBy="brand1")
	private Product product;
	
	
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(int brand_id, String brand_name, Product product,Retailer retailer) {
		super();
		this.brand_id = brand_id;
		this.brand_name = brand_name;
		this.product = product;
		this.retailer = retailer;
	}
	@Override
	public String toString() {
		return "Brand [brand_id=" + brand_id + ", brand_name=" + brand_name + ", retailer=" + retailer + ", product="
				+ product + "]";
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public Retailer getRetailer() {
		return retailer;
	}
	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
