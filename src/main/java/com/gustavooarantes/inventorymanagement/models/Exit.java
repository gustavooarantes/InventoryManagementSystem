package com.gustavooarantes.inventorymanagement.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Exits")
public class Exit {
    @Id
    private String exitId;

    @Column(name = "exit_quantity")
    private int exitQuantity;

    @Column(name = "unit_cost")
    private float unitCost;

    @Column(name = "exit_date")
    private LocalDate exitDate;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;
}
