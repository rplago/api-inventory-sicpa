package com.sicpa.api.inventory.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "location_inventory")
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor
public class Location {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "location")
    private List<Item> items;
}
