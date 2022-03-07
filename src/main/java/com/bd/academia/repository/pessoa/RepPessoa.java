package com.bd.academia.repository.pessoa;

import com.bd.academia.entity.pessoa.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepPessoa extends JpaRepository<Pessoa, Long>  {
    
}
