package com.bd.academia.repository.estoqueProduto;

import com.bd.academia.entity.academia.Academia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepEstoqueProduto extends JpaRepository<Academia, Long> {
    
}