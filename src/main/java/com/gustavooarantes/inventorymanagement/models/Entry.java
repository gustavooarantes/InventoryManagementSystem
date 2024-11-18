package com.gustavooarantes.inventorymanagement.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Entries")
public class Entry {
    @Id
    private String entryId;

    @Column(name = "entry_quantity")
    private int entryQuantity;

    @Column(name = "unit_cost")
    private float unitCost;

    @Column(name = "entry_date")
    private LocalDate entryDate;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "supplier_id", referencedColumnName = "supplier_id")
    private Supplier supplier;
}
