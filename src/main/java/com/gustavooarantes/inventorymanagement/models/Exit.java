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
@Table(name = "Exits")
public class Exit {
    @Id
    @Column(name = "exit_id")
    private String exitId;

    @Column(name = "exit_quantity")
    private int exitQuantity;

    @Column(name = "unit_cost")
    private float unitCost;

    @Column(name = "exit_date")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate exitDate;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
