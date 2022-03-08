package com.bd.academia.service.tipoAvFisica;

import java.util.List;

import com.bd.academia.core.entity.ResourceNotFound;
import com.bd.academia.entity.tipoAvFisica.TipoAvFisica;
import com.bd.academia.repository.tipoAvFisica.RepTipoAvFisica;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ServTipoAvFisica {

    @Autowired
    private RepTipoAvFisica repTipoAvFisica;

    public TipoAvFisica cadastrar(TipoAvFisica tipoAvFisica) {
        return repTipoAvFisica.saveAndFlush(tipoAvFisica);
    }

    public List<TipoAvFisica> recuperarTodos() {
        return repTipoAvFisica.findAll();
    }

    public TipoAvFisica recuperarPorId(long id) {
        TipoAvFisica tipoAvFisica = repTipoAvFisica.getById(id);
        return tipoAvFisica;
    }

    public TipoAvFisica atualizar(TipoAvFisica tipoAvFisica) {
        validaTipoAvFisicaById(tipoAvFisica.getIdTipoAvFisica());

        return cadastrar(tipoAvFisica);
    }

    public String remover(long id) {
        validaTipoAvFisicaById(id);

        repTipoAvFisica.deleteById(id);

        return "TipoAvFisica removido com sucesso!";
    }

    public void validaTipoAvFisicaById(long id) {
        TipoAvFisica tipoAvFisicaAtual = recuperarPorId(id);

        if (tipoAvFisicaAtual == null) {
            throw new ResourceNotFound("TipoAvFisica não encontrado: " + id);
        }
    }
    
}
