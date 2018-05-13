package com.momo.webns.demo.config.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.momo.webns.demo.config.data.entity.Customer;
import com.momo.webns.demo.config.service.CustomerService;

import java.util.List;

@RestController("/")
public class CustomerWebService {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAll(){
        return this.customerService.getAll();
    }

//    @GetMapping("/{id}")
//    public Customer getOne(@PathVariable("id")String id){
//        return this.customerService.findOne(id);
//    }
}
