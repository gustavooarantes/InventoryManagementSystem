package com.gustavooarantes.inventorymanagement.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Products")
public class Product {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "product_sku", unique = true, nullable = false)
    private Long productSku;

    @Column(name = "cost_price", nullable = false)
    private float costPrice;

    @Column(name = "selling_price", nullable = false)
    private float sellingPrice;

    @Column(name = "stock_quantity")
    private int stockQuantity;

    @Column(name = "minimum_quantity")
    private int minimumQuantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
}
