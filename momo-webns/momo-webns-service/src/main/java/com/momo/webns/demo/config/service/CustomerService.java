package com.momo.webns.demo.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momo.webns.demo.config.aspect.Loggable;
import com.momo.webns.demo.config.data.entity.Customer;
import com.momo.webns.demo.config.data.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Loggable
    public List<Customer> getAll(){
        return (List<Customer>) this.customerRepository.findAll();
    }

//    @Loggable
//    public Customer findOne(String id){
//        return this.customerRepository.findOne(id);
//    }
}
