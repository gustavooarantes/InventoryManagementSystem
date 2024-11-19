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
@Table(name = "Categories")
public class Category {
    @Id
    @Column(name = "category_id")
    private String categoryId;

    @Column(name = "category_name", nullable = false, unique = true)
    private String categoryName;
}
