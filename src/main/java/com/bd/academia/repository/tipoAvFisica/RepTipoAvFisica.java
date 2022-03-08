package com.bd.academia.repository.tipoAvFisica;

import com.bd.academia.entity.tipoAvFisica.TipoAvFisica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepTipoAvFisica extends JpaRepository<TipoAvFisica, Long> {
    
}
