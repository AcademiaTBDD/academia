package com.bd.academia.repository.endereco;

import com.bd.academia.entity.endereco.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepEndereco extends JpaRepository<Endereco, Long> {
    
}
