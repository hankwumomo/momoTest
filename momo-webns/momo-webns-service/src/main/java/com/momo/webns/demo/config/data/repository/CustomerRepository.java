package com.momo.webns.demo.config.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.momo.webns.demo.config.data.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String>{

	

}
