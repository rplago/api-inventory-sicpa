package com.sicpa.api.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sicpa.api.inventory.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> { 
	
}