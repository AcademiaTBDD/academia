package com.bd.academia.repository.produto;

import com.bd.academia.entity.produto.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepProduto extends JpaRepository<Produto , Long> {
    
}
