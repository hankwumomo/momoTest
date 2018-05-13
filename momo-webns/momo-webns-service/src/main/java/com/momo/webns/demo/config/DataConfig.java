package com.momo.webns.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.momo.webns.demo.config.data.repository.CustomerRepository;
import com.momo.webns.demo.config.data.repository.InventoryItemRepository;
import com.momo.webns.demo.config.data.repository.SalesOrderRepository;


@Configuration
public class DataConfig {

    @Bean
    public InventoryItemRepository inventoryItemRepository(){
        return new InventoryItemRepository();
    }

//    @Bean
//    public CustomerRepository customerRepository(){
//        return new CustomerRepository();
//    }

    @Bean
    public SalesOrderRepository salesOrderRepository(){
        return new SalesOrderRepository();
    }
}