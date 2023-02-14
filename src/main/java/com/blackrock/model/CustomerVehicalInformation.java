package com.blackrock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerVehicalInformation {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int vehicalid;
private String vehicalmodel;
private String chassisnumber;
private double vehicalprice;
}
