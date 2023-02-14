package com.blackrock.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackrock.model.CustomerBasicDetails;
import com.blackrock.repository.Repository;
import com.blackrock.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	Repository repository;

	@Override
	public CustomerBasicDetails savedata(CustomerBasicDetails cd) {
		
		return repository.save(cd);
	}

	@Override
	public Iterable<CustomerBasicDetails> getAlldetails() {
		
		return repository.findAll();
	}

}
