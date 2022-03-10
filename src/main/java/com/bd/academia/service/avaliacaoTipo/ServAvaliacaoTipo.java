package com.bd.academia.service.avaliacaoTipo;

import java.util.List;

import com.bd.academia.entity.avaliacaoTipo.AvaliacaoTipo;
import com.bd.academia.repository.avaliacaoTipo.RepAvaliacaoTipo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServAvaliacaoTipo {


    @Autowired
    private RepAvaliacaoTipo repAvaliacaoTipo;

    public AvaliacaoTipo cadastrar(AvaliacaoTipo avaliacaoTipo) {
       return repAvaliacaoTipo.saveAndFlush(avaliacaoTipo);
    }
    

    public List<AvaliacaoTipo> recuperarTodos() {
        return repAvaliacaoTipo.findAll();
    }

    public AvaliacaoTipo atualizar(AvaliacaoTipo avaliacaoTipo) {
        return cadastrar(avaliacaoTipo);
    }

   
    public String remover(AvaliacaoTipo avaliacaoTipo) {

        repAvaliacaoTipo.delete(avaliacaoTipo);

        return "avaliacaoTipo removido com sucesso!";
    }
    
}
