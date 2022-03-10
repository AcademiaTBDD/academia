package com.bd.academia.repository.avaliacaoFisica;


import com.bd.academia.entity.avaliacaoFisica.AvaliacaoFisica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepAvaliacaoFisica extends JpaRepository<AvaliacaoFisica, Long> {
    
}