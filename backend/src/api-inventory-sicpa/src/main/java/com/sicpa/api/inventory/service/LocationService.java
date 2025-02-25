package com.sicpa.api.inventory.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sicpa.api.inventory.dto.OnEventRequestDTO;
import com.sicpa.api.inventory.model.Item;
import com.sicpa.api.inventory.model.Location;
import com.sicpa.api.inventory.repository.ItemRepository;
import com.sicpa.api.inventory.repository.LocationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Transactional
    public String moveItemToLocation(OnEventRequestDTO onEventRequestDTO) {
    	Long itemId = onEventRequestDTO.getItemId();
    	Long locationId = onEventRequestDTO.getLocationId();
        Item item = itemRepository.findById(itemId).orElseThrow(() -> new RuntimeException("Item not found"));
        Location location = locationRepository.findById(locationId).orElseThrow(() -> new RuntimeException("Location not found"));

        item.setLocation(location);
        itemRepository.save(item);

        return "Item " + itemId + " moved to Location " + locationId;
    }

    public List<Long> getInventory(Long locationId) {
        Location location = locationRepository.findById(locationId)
                .orElseThrow(() -> new RuntimeException("Location not found"));

        return location.getItems().stream()
                .map(Item::getId)
                .collect(Collectors.toList());
    }
}
