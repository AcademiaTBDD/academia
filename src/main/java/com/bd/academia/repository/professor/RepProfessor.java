package com.bd.academia.repository.professor;

import com.bd.academia.entity.academia.Academia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepProfessor extends JpaRepository<Academia, Long> {
    
}
