package com.bd.academia.controller.endereco;

import java.util.List;

import com.bd.academia.entity.endereco.Endereco;
import com.bd.academia.service.endereco.ServEndereco;

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
@RequestMapping("api/endereco")
public class EnderecoController {

    @Autowired
    private ServEndereco servEndereco;

    @PostMapping()
    public ResponseEntity<Endereco> cadastrar(@RequestBody Endereco endereco) {
        Endereco newEndereco = servEndereco.cadastrar(endereco);

        return new ResponseEntity<Endereco>(newEndereco, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Endereco>> recuperarTodos() {
        List<Endereco> enderecos = servEndereco.recuperarTodos();

        return new ResponseEntity<List<Endereco>>(enderecos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> recuperarPorId(@PathVariable long id) {
        Endereco endereco = servEndereco.recuperarPorId(id);

        return new ResponseEntity<Endereco>(endereco, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Endereco> atualizar(@RequestBody Endereco endereco) {
        Endereco enderecoAtualizado = servEndereco.atualizar(endereco);

        return new ResponseEntity<Endereco>(enderecoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable long id) {
        String message = servEndereco.remover(id);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }

}
