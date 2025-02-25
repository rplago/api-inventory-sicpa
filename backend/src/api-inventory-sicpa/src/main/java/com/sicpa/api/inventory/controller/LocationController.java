package com.sicpa.api.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sicpa.api.inventory.dto.OnEventRequestDTO;
import com.sicpa.api.inventory.service.LocationService;

import java.util.List;

@RestController
@RequestMapping("/api/sicpa")
public class LocationController {

	@Autowired
    private LocationService locationService;

    @PostMapping(value = "/onEvent", consumes = "application/json")
    public ResponseEntity<String> onEvent(@RequestBody OnEventRequestDTO onEventRequestDTO) {
        String response = locationService.moveItemToLocation(onEventRequestDTO);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/inventory/{locationId}")
    public ResponseEntity<List<Long>> inventory(@PathVariable Long locationId) {
        List<Long> itemIds = locationService.getInventory(locationId);
        return ResponseEntity.ok(itemIds);
    }
}
