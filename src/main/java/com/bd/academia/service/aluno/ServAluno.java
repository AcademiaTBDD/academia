package com.bd.academia.service.aluno;

import java.util.List;

import com.bd.academia.core.entity.ResourceNotFound;
import com.bd.academia.entity.aluno.Aluno;
import com.bd.academia.repository.aluno.RepAluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServAluno {
    @Autowired
    private RepAluno repAluno;

    public Aluno cadastrar(Aluno planoAcademia) {
        return repAluno.saveAndFlush(planoAcademia);
    }

    public List<Aluno> recuperarTodos() {
        return repAluno.findAll();
    }

    public Aluno recuperarPorId(long id) {
        Aluno planoAcademia = repAluno.getById(id);
        return planoAcademia;
    }

    public Aluno atualizar(Aluno planoAcademia) {
        validaplanoAcademiaById(planoAcademia.getIdaluno());

        return cadastrar(planoAcademia);
    }

    public String remover(long id) {
        validaplanoAcademiaById(id);

        repAluno.deleteById(id);

        return "Aluno removido com sucesso!";
    }

    public void validaplanoAcademiaById(long id) {
        Aluno planoAtual = recuperarPorId(id);

        if (planoAtual == null) {
            throw new ResourceNotFound("Aluno não encontrado: " + id);
        }
    }
}
