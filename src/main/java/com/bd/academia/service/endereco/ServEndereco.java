package com.bd.academia.service.endereco;

import java.util.List;

import com.bd.academia.core.entity.ResourceNotFound;
import com.bd.academia.entity.endereco.Endereco;
import com.bd.academia.repository.endereco.RepEndereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServEndereco {

    @Autowired
    private RepEndereco repEndereco;

    public Endereco cadastrar(Endereco endereco) {
        return repEndereco.saveAndFlush(endereco);
    }

    public List<Endereco> recuperarTodos() {
        return repEndereco.findAll();
    }

    public Endereco recuperarPorId(long id) {
        Endereco endereco = repEndereco.getById(id);
        return endereco;
    }

    public Endereco atualizar(Endereco endereco) {
        validaEnderecoById(endereco.getIdEndereco());

        return cadastrar(endereco);
    }

    public String remover(long id) {
        validaEnderecoById(id);

        repEndereco.deleteById(id);

        return "Endereço removido com sucesso!";
    }

    public void validaEnderecoById(long id) {
        Endereco enderecoAtual = recuperarPorId(id);

        if (enderecoAtual == null) {
            throw new ResourceNotFound("Endereço não encontrado: " + id);
        }
    }
}
