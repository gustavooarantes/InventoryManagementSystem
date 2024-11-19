package com.gustavooarantes.inventorymanagement.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Entries")
public class Entry {
    @Id
    @Column(name = "entry_id")
    private String entryId;

    @Column(name = "entry_quantity")
    private int entryQuantity;

    @Column(name = "unit_cost")
    private float unitCost;

    @Column(name = "entry_date")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate entryDate;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
}
