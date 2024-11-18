package com.gustavooarantes.inventorymanagement.repositories;

import com.gustavooarantes.inventorymanagement.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
}
