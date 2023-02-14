package com.blackrock.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.blackrock.model.CustomerBasicDetails;

public interface Repository extends JpaRepository<CustomerBasicDetails, Integer> {

}
