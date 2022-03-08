package com.bd.academia.repository.professor;

import com.bd.academia.entity.professor.Professor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepProfessor extends JpaRepository<Professor, Long>  {

}
