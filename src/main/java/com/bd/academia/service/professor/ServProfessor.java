package com.bd.academia.service.professor;
import java.util.List;

import com.bd.academia.core.entity.ResourceNotFound;
import com.bd.academia.entity.professor.Professor;
import com.bd.academia.repository.professor.RepProfessor;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ServProfessor {
    @Autowired
    private RepProfessor repProfessor;

    public Professor cadastrar(Professor professor) {
        return repProfessor.saveAndFlush(professor);
    }

    public List<Professor> recuperarTodos() {
        return repProfessor.findAll();
    }

    public Professor recuperarPorId(long id) {
        Professor professor = repProfessor.getById(id);
        return professor;
    }

    public Professor atualizar(Professor professor) {
        validaProfessorById(professor.getIdprofessor());

        return cadastrar(professor);
    }

    public String remover(long id) {
        validaProfessorById(id);

        repProfessor.deleteById(id);

        return "Professor removido com sucesso!";
    }

    public void validaProfessorById(long id) {
        Professor professorAtual = recuperarPorId(id);

        if (professorAtual == null) {
            throw new ResourceNotFound("Professor não encontrado: " + id);
        }
    }
}
