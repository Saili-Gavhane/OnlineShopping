package com.lti.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Retailer {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int retailer_id;
	String retailer_name;
	String retailer_email;
	String retailer_password;
	String retailer_mobileno;
	String gst_no;
	String pan_no;
	int aadhar_no;
	String approval_status;
	String remark;
	
	@OneToOne
	@JoinColumn(name="bankdetails_id")
	private BankDetails bankdetails;
	
	@OneToOne
	@JoinColumn(name="brand_id")
	private Brand brand;
	
	@OneToOne(mappedBy="retailer")
	private Product product;
	
	@OneToMany(mappedBy="retailer")
    private Set<RetailerAddress> retaileraddress;

	public Retailer() {
		super();
		// TODO Auto-generated constructor stub
	}

public Retailer(int retailer_id, String retailer_name, String retailer_email, String retailer_password,
			String retailer_mobileno, String gst_no, String pan_no, int aadhar_no, String approval_status,
			String remark, BankDetails bankdetails, Brand brand, Set<RetailerAddress> retaileraddress) {
		super();
		this.retailer_id = retailer_id;
		this.retailer_name = retailer_name;
		this.retailer_email = retailer_email;
		this.retailer_password = retailer_password;
		this.retailer_mobileno = retailer_mobileno;
		this.gst_no = gst_no;
		this.pan_no = pan_no;
		this.aadhar_no = aadhar_no;
		this.approval_status = approval_status;
		this.remark = remark;
		this.bankdetails = bankdetails;
		this.brand = brand;
		this.retaileraddress = retaileraddress;
	}
	public String getApproval_status() {
		return approval_status;
	}



	public void setApproval_status(String approval_status) {
		this.approval_status = approval_status;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	public int getRetailer_id() {
		return retailer_id;
	}

	public void setRetailer_id(int retailer_id) {
		this.retailer_id = retailer_id;
	}

	public String getRetailer_name() {
		return retailer_name;
	}

	public void setRetailer_name(String retailer_name) {
		this.retailer_name = retailer_name;
	}

	public String getRetailer_email() {
		return retailer_email;
	}

	public void setRetailer_email(String retailer_email) {
		this.retailer_email = retailer_email;
	}

	public String getRetailer_password() {
		return retailer_password;
	}

	public void setRetailer_password(String retailer_password) {
		this.retailer_password = retailer_password;
	}

	public String getRetailer_mobileno() {
		return retailer_mobileno;
	}

	public void setRetailer_mobileno(String retailer_mobileno) {
		this.retailer_mobileno = retailer_mobileno;
	}

	public String getGst_no() {
		return gst_no;
	}

	public void setGst_no(String gst_no) {
		this.gst_no = gst_no;
	}

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	public int getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(int aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public BankDetails getBankdetails() {
		return bankdetails;
	}

	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Retailer [retailer_id=" + retailer_id + ", retailer_name=" + retailer_name + ", retailer_email="
				+ retailer_email + ", retailer_password=" + retailer_password + ", retailer_mobileno="
				+ retailer_mobileno + ", gst_no=" + gst_no + ", pan_no=" + pan_no + ", aadhar_no=" + aadhar_no
				+ ", approval_status=" + approval_status + ", remark=" + remark + ", bankdetails=" + bankdetails
				+ ", brand=" + brand + ", retaileraddress=" + retaileraddress + "]";
	}





}
