package com.bd.academia.controller.pessoa;

import java.util.List;

import com.bd.academia.entity.pessoa.Pessoa;
import com.bd.academia.service.pessoa.ServPessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/pessoa")

public class PessoaController {

    @Autowired
    private ServPessoa servPessoa;

    @PostMapping()
    public ResponseEntity<Pessoa> cadastrar(@RequestBody Pessoa pessoa) {
        Pessoa newPessoa = servPessoa.cadastrar(pessoa);

        return new ResponseEntity<Pessoa>(newPessoa, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Pessoa>> recuperarTodos() {
        List<Pessoa> pessoas = servPessoa.recuperarTodos();

        return new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> recuperarPorId(@PathVariable long id) {
        Pessoa pessoa = servPessoa.recuperarPorId(id);

        return new ResponseEntity<Pessoa>(pessoa, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Pessoa> atualizar(@RequestBody Pessoa pessoa) {
        Pessoa pessoaAtualizado = servPessoa.atualizar(pessoa);

        return new ResponseEntity<Pessoa>(pessoaAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable long id) {
        String message = servPessoa.remover(id);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
    
}
