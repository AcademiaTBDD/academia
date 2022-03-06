package com.bd.academia.repository.treino;

import com.bd.academia.entity.academia.Academia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepTreino extends JpaRepository<Academia, Long> {
    
}