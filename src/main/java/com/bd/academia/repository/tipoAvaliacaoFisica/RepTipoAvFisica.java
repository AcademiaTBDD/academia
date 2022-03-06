package com.bd.academia.repository.tipoAvaliacaoFisica;

import com.bd.academia.entity.academia.Academia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepTipoAvFisica extends JpaRepository<Academia, Long> {
    
}