package com.sicpa.api.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sicpa.api.inventory.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> { 
	
}
