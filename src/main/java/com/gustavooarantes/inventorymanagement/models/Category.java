package com.gustavooarantes.inventorymanagement.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categories")
public class Category {
    @Id
    private String categoryId;

    @Column(name = "category_name", nullable = false, unique = true)
    private String categoryName;
}
