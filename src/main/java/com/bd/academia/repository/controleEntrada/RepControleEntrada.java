package com.bd.academia.repository.controleEntrada;

import com.bd.academia.entity.academia.Academia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepControleEntrada extends JpaRepository<Academia, Long> {
    
}