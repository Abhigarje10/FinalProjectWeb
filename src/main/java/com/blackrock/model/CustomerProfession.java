package com.blackrock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerProfession {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
private int professionid;
	private String professiontype;
	private double professionmonthlyincome;
	private String pprofessiondesignation;
}
