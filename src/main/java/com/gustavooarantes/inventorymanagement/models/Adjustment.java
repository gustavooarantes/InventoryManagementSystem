package com.gustavooarantes.inventorymanagement.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Adjustments")
public class Adjustment {
    @Id
    private String adjustmentId;

    @Column(name = "adjusted_quantity")
    private int adjustedQuantity;

    @Column(name = "reason")
    private String reason;

    @Column(name = "adjustment_date")
    private LocalDate adjustmentDate;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;
}
