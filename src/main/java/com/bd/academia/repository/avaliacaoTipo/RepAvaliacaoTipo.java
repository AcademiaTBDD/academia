package com.bd.academia.repository.avaliacaoTipo;



import com.bd.academia.entity.avaliacaoTipo.AvaliacaoTipo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepAvaliacaoTipo extends JpaRepository<AvaliacaoTipo, Long> {
    
}