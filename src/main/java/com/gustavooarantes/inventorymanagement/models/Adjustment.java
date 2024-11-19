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
@Table(name = "Adjustments")
public class Adjustment {
    @Id
    @Column(name = "adjustment_id")
    private String adjustmentId;

    @Column(name = "adjusted_quantity")
    private int adjustedQuantity;

    @Column(name = "reason")
    private String reason;

    @Column(name = "adjustment_date")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate adjustmentDate;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
