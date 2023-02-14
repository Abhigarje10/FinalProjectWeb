package com.blackrock.service;

import com.blackrock.model.CustomerBasicDetails;

public interface CustomerService {

public CustomerBasicDetails savedata(CustomerBasicDetails cd);

public Iterable<CustomerBasicDetails> getAlldetails();

}
