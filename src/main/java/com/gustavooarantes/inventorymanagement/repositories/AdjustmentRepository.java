package com.gustavooarantes.inventorymanagement.repositories;

import com.gustavooarantes.inventorymanagement.models.Adjustment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdjustmentRepository extends JpaRepository<Adjustment, String> {
}
