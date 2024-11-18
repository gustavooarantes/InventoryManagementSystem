package com.gustavooarantes.inventorymanagement.repositories;

import com.gustavooarantes.inventorymanagement.models.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends JpaRepository<Entry, String> {
}
