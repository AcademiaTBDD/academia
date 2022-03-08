package com.bd.academia.service.treino;

import java.util.List;

import com.bd.academia.core.entity.ResourceNotFound;
import com.bd.academia.entity.treino.Treino;
import com.bd.academia.repository.treino.RepTreino;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ServTreino {

    @Autowired
    private RepTreino repTreino;

    public Treino cadastrar(Treino treino) {
        return repTreino.saveAndFlush(treino);
    }

    public List<Treino> recuperarTodos() {
        return repTreino.findAll();
    }

    public Treino recuperarPorId(long id) {
        Treino treino = repTreino.getById(id);
        return treino;
    }

    public Treino atualizar(Treino treino) {
        validaTreinoById(treino.getIdTreino());

        return cadastrar(treino);
    }

    public String remover(long id) {
        validaTreinoById(id);

        repTreino.deleteById(id);

        return "Treino removido com sucesso!";
    }

    public void validaTreinoById(long id) {
        Treino treinoAtual = recuperarPorId(id);

        if (treinoAtual == null) {
            throw new ResourceNotFound("Treino não encontrado: " + id);
        }
    }


    
}
