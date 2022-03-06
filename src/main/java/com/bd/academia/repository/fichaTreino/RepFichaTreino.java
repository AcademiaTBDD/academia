package com.bd.academia.repository.fichaTreino;

import com.bd.academia.entity.academia.Academia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepFichaTreino extends JpaRepository<Academia, Long> {
    
}
