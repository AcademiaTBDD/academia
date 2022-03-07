package com.bd.academia.repository.estoqueProduto;

import com.bd.academia.entity.estoqueProduto.Estoque_Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepEstoque_Produto extends JpaRepository<Estoque_Produto, Long>{
    
}
