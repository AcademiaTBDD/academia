package com.bd.academia.service.planoAcademia;

import java.util.List;

import com.bd.academia.core.entity.ResourceNotFound;
import com.bd.academia.entity.planoAcademia.PlanoAcademia;
import com.bd.academia.repository.planoAcademia.RepPlanoAcademia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServPlanoAcademia {
    @Autowired
    private RepPlanoAcademia repPlanoAcademia;

    public PlanoAcademia cadastrar(PlanoAcademia planoAcademia) {
        return repPlanoAcademia.saveAndFlush(planoAcademia);
    }

    public List<PlanoAcademia> recuperarTodos() {
        return repPlanoAcademia.findAll();
    }

    public PlanoAcademia recuperarPorId(long id) {
        PlanoAcademia planoAcademia = repPlanoAcademia.getById(id);
        return planoAcademia;
    }

    public PlanoAcademia atualizar(PlanoAcademia planoAcademia) {
        validaplanoAcademiaById(planoAcademia.getIdPlano());

        return cadastrar(planoAcademia);
    }

    public String remover(long id) {
        validaplanoAcademiaById(id);

        repPlanoAcademia.deleteById(id);

        return "Plano removido com sucesso!";
    }

    public void validaplanoAcademiaById(long id) {
        PlanoAcademia planoAtual = recuperarPorId(id);

        if (planoAtual == null) {
            throw new ResourceNotFound("Plano não encontrado: " + id);
        }
    }
    
}
