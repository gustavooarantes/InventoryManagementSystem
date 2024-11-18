package com.gustavooarantes.inventorymanagement.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Registers")
public class Register {
    @Id
    private String registerId;

    @Column(name = "movement_date")
    private LocalDate movementDate;

    @Column(name = "movement_type", nullable = false)
    private String movementType; // entry, exit or adjustment

    @Column(name = "movement_quantity")
    private int movementQuantity;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;
}
