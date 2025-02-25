package com.sicpa.api.inventory.dto;

import lombok.Data;

@Data
public class OnEventRequestDTO {
    private Long itemId;
    private Long locationId;
}