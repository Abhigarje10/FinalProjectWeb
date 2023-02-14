package com.blackrock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerBasicDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerid;
	private String customername;
	private String customermiddlename;
	private String customerlastname;
	private long mobileno;
	private long adharno;
	private String pancardno;
	private int CIBIL;
	private String email;
	private String DOB;
	private String gender;
	private String Qualification;
	private double loanamountrequired;
	private String loanstatus;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomermiddlename() {
		return customermiddlename;
	}
	public void setCustomermiddlename(String customermiddlename) {
		this.customermiddlename = customermiddlename;
	}
	public String getCustomerlastname() {
		return customerlastname;
	}
	public void setCustomerlastname(String customerlastname) {
		this.customerlastname = customerlastname;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public String getPancardno() {
		return pancardno;
	}
	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}
	public int getCIBIL() {
		return CIBIL;
	}
	public void setCIBIL(int cIBIL) {
		CIBIL = cIBIL;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public double getLoanamountrequired() {
		return loanamountrequired;
	}
	public void setLoanamountrequired(double loanamountrequired) {
		this.loanamountrequired = loanamountrequired;
	}
	public String getLoanstatus() {
		return loanstatus;
	}
	public void setLoanstatus(String loanstatus) {
		this.loanstatus = loanstatus;
	}
	
	
	

}
