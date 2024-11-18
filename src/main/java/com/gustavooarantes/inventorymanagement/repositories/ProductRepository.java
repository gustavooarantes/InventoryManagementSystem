package com.gustavooarantes.inventorymanagement.repositories;

import com.gustavooarantes.inventorymanagement.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
