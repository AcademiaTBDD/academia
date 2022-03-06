package com.bd.academia.repository.produto;

import com.bd.academia.entity.academia.Academia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepProduto extends JpaRepository<Academia, Long> {
    
}
