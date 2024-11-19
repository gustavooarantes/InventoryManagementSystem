package com.gustavooarantes.inventorymanagement.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Suppliers")
public class Supplier {
    @Id
    @Column(name = "supplier_id")
    private String supplierId;

    @Column(name = "supplier_name", unique = true, nullable = false)
    private String supplierName;

    @Column(name = "supplier_manager", nullable = false)
    private String supplierManager;

    @Column(name = "supplier_contact", nullable = false)
    private String supplierContact; // phone number

    @Column(name = "supplier_email", unique = true, nullable = false)
    private String supplierEmail;

    @Column(name = "supplier_address")
    private String supplierAddress;

    @Column(name = "supplier_status")
    private boolean supplierStatus;
}
