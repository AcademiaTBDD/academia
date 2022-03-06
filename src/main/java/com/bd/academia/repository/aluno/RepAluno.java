package com.bd.academia.repository.aluno;

import com.bd.academia.entity.aluno.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepAluno extends JpaRepository<Aluno, Long> {

}
