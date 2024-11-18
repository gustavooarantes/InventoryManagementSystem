package com.gustavooarantes.inventorymanagement.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Products")
public class Product {
    @Id
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
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "supplier_id", referencedColumnName = "supplier_id")
    private Supplier supplier;
}
