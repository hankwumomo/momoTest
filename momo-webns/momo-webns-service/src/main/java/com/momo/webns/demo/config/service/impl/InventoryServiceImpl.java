package com.momo.webns.demo.config.service.impl;

import org.springframework.stereotype.Service;

import com.momo.webns.demo.config.data.repository.InventoryItemRepository;
import com.momo.webns.demo.config.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService{

	public InventoryServiceImpl(InventoryItemRepository inventoryItemRepository) {
		// TODO Auto-generated constructor stub
	}

}
