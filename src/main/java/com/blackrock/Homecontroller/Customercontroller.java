package com.blackrock.Homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blackrock.model.CustomerBasicDetails;
import com.blackrock.service.CustomerService;


@RestController
public class Customercontroller {
@Autowired
CustomerService customerservice;

@PostMapping("/customerdetails")

public ResponseEntity<CustomerBasicDetails> savedata(@RequestBody CustomerBasicDetails cd)
{
	
	
	CustomerBasicDetails cb=customerservice.savedata(cd);
	return new ResponseEntity<CustomerBasicDetails>(cb,HttpStatus.CREATED);
}


@GetMapping("/getcustomerdata")

public ResponseEntity<Iterable<CustomerBasicDetails>> getAlldetails()
{
	
	Iterable<CustomerBasicDetails>cb1=customerservice.getAlldetails();
	
	return new ResponseEntity<Iterable<CustomerBasicDetails>>(cb1,HttpStatus.OK);		
	
}




}
