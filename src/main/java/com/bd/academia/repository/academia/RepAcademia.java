package com.bd.academia.repository.academia;

import com.bd.academia.entity.academia.Academia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepAcademia extends JpaRepository<Academia, Long> {
    
}
