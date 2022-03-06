package com.bd.academia.repository.AvaliacaoFisica;

import com.bd.academia.entity.academia.Academia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepAvaliacaoFisica extends JpaRepository<Academia, Long> {
    
}