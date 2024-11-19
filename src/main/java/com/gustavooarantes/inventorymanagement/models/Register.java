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
@Table(name = "Registers")
public class Register {
    @Id
    @Column(name = "register_id")
    private String registerId;

    @Column(name = "movement_date")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate movementDate;

    @Column(name = "movement_type", nullable = false)
    private String movementType; // entry, exit or adjustment

    @Column(name = "movement_quantity")
    private int movementQuantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
