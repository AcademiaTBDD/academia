package com.bd.academia.service.avaliacaoFisica;

import java.util.List;

import com.bd.academia.core.entity.ResourceNotFound;
import com.bd.academia.entity.avaliacaoFisica.AvaliacaoFisica;
import com.bd.academia.repository.avaliacaoFisica.RepAvaliacaoFisica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServAvaliacaoFisica {


    @Autowired
    private RepAvaliacaoFisica repAvaliacaoFisica;



    public AvaliacaoFisica cadastrar(AvaliacaoFisica avaliacaoFisica) {
        return repAvaliacaoFisica.saveAndFlush(avaliacaoFisica);
    }

    public List<AvaliacaoFisica> recuperarTodos() {
        return repAvaliacaoFisica.findAll();
    }

    public AvaliacaoFisica recuperarPorId(long id) {
        
        try {
            AvaliacaoFisica avaliacaoFisica = repAvaliacaoFisica.getById(id);
            return avaliacaoFisica;
           } catch (Exception e) {
            throw  new ResourceNotFound("Avaliacao fisica não encontrado: " + id);
           }
           
    }

    public AvaliacaoFisica atualizar(AvaliacaoFisica avaliacaoFisica) {
        validaAcademiaById(avaliacaoFisica.getIdavaliacao());
        return cadastrar(avaliacaoFisica);
    }

    public String remover(long id) {
        validaAcademiaById(id);
        repAvaliacaoFisica.deleteById(id);
        return "Avaliacao fisica removida com sucesso!";
    }   

    public void validaAcademiaById(long id) {
       try {
        AvaliacaoFisica avaliacaoFisicaAtual = recuperarPorId(id);
        avaliacaoFisicaAtual.getIdavaliacao();
       } catch (Exception e) {
        throw  new ResourceNotFound("Avaliacao fisica não encontrado: " + id);
       }
    }
}
