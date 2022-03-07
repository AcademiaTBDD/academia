package com.bd.academia.service.pessoa;

import java.util.List;

import com.bd.academia.core.entity.ResourceNotFound;
import com.bd.academia.entity.pessoa.Pessoa;
import com.bd.academia.repository.pessoa.RepPessoa;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ServPessoa {
    @Autowired
    private RepPessoa repPessoa;

    public Pessoa cadastrar(Pessoa pessoa) {
        return repPessoa.saveAndFlush(pessoa);
    }

    public List<Pessoa> recuperarTodos() {
        return repPessoa.findAll();
    }

    public Pessoa recuperarPorId(long id) {
        Pessoa pessoa = repPessoa.getById(id);
        return pessoa;
    }

    public Pessoa atualizar(Pessoa pessoa) {
        validaPessoaById(pessoa.getIdPessoa());

        return cadastrar(pessoa);
    }

    public String remover(long id) {
        validaPessoaById(id);

        repPessoa.deleteById(id);

        return "Pessoa removido com sucesso!";
    }

    public void validaPessoaById(long id) {
        Pessoa pessoaAtual = recuperarPorId(id);

        if (pessoaAtual == null) {
            throw new ResourceNotFound("Pessoa não encontrado: " + id);
        }
    }
    
}
