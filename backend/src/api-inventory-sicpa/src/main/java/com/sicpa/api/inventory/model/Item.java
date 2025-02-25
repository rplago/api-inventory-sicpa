package com.sicpa.api.inventory.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "item")
@Getter @Setter 
@NoArgsConstructor 
@AllArgsConstructor
public class Item {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = true)
    private Location location;
}
