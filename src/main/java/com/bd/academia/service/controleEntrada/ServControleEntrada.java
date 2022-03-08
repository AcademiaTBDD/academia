package com.bd.academia.service.controleEntrada;

import java.util.List;

import com.bd.academia.core.entity.ResourceNotFound;
import com.bd.academia.entity.controleEntrada.ControleEntrada;
import com.bd.academia.repository.controleEntrada.RepControleEntrada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServControleEntrada {
    @Autowired
    private RepControleEntrada repControleEntrada;

    public ControleEntrada cadastrar(ControleEntrada controleEntrada) {
        return repControleEntrada.saveAndFlush(controleEntrada);
    }

    public List<ControleEntrada> recuperarTodos() {
        return repControleEntrada.findAll();
    }
     public List<ControleEntrada> findEntradas() {
        return repControleEntrada.findEntradas();
    }

    

    public ControleEntrada recuperarPorId(long id) {
        ControleEntrada controleEntrada = repControleEntrada.getById(id);
        return controleEntrada;
    }

    public ControleEntrada atualizar(ControleEntrada controleEntrada) {
        validaById(controleEntrada.getIdControle());

        return cadastrar(controleEntrada);
    }

    public String remover(long id) {
        validaById(id);

        repControleEntrada.deleteById(id);

        return "Entrada/Saída removido com sucesso!";
    }

    public void validaById(long id) {
        ControleEntrada ControleAtual = recuperarPorId(id);

        if (ControleAtual == null) {
            throw new ResourceNotFound("Entrada/Saída não encontrado: " + id);
        }
    }
}
