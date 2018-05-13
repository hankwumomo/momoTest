package com.momo.webns.demo.config.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momo.webns.demo.config.data.repository.CustomerRepository;
import com.momo.webns.demo.config.data.repository.SalesOrderRepository;
import com.momo.webns.demo.config.service.InventoryService;
import com.momo.webns.demo.config.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	private final InventoryService inventoryService;
	private final CustomerRepository customerRepository;
	private final SalesOrderRepository salesOrderRepository;

	@Autowired
	public OrderServiceImpl(InventoryService inventoryService, CustomerRepository customerRepository,
			SalesOrderRepository salesOrderRepository) {
		// TODO Auto-generated constructor stub
		this.inventoryService = inventoryService;
        this.customerRepository = customerRepository;
        this.salesOrderRepository = salesOrderRepository;
	}

}
