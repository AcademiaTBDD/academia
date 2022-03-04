package com.bd.academia.service.endereco;

import java.util.Optional;

import com.bd.academia.entity.endereco.Endereco;
import com.bd.academia.repository.endereco.RepEndereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServEndereco {

    @Autowired
    private RepEndereco repEndereco;

    public Endereco salvarEndereco(Endereco endereco) {
        return repEndereco.saveAndFlush(endereco);
    }

    public Optional<Endereco> recuperarEndereco(long id) {
        Optional<Endereco> enderecos = repEndereco.findById(id);

        return enderecos;
    }
}
