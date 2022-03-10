package com.bd.academia.controller.avaliacaoFisica;

import java.util.List;

import com.bd.academia.entity.avaliacaoFisica.AvaliacaoFisica;
import com.bd.academia.service.avaliacaoFisica.ServAvaliacaoFisica;

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
@RequestMapping("api/avaliacaofisica")
public class AvaliacaoFisicaController {

    @Autowired
    private ServAvaliacaoFisica servaAvaliacaoFisica;

    @PostMapping()
    public ResponseEntity<AvaliacaoFisica> cadastrar(@RequestBody AvaliacaoFisica avaliacaoFisica) {
        AvaliacaoFisica newAvaliacaoFisica = servaAvaliacaoFisica.cadastrar(avaliacaoFisica);

        return new ResponseEntity<AvaliacaoFisica>(newAvaliacaoFisica, HttpStatus.CREATED);
    }

     @GetMapping()
     public ResponseEntity<List<AvaliacaoFisica>> recuperarTodos() {
         List<AvaliacaoFisica> avaliacaoFisica = servaAvaliacaoFisica.recuperarTodos();

        return new ResponseEntity<List<AvaliacaoFisica>>(avaliacaoFisica, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AvaliacaoFisica> recuperarPorId(@PathVariable long id) {
        AvaliacaoFisica avaliacaoFisica = servaAvaliacaoFisica.recuperarPorId(id);

        return new ResponseEntity<AvaliacaoFisica>(avaliacaoFisica, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<AvaliacaoFisica> atualizar(@RequestBody AvaliacaoFisica entradas_saidas) {
        AvaliacaoFisica entradaSaidaAtualizado = servaAvaliacaoFisica.atualizar(entradas_saidas);

        return new ResponseEntity<AvaliacaoFisica>(entradaSaidaAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable long id) {
        String message = servaAvaliacaoFisica.remover(id);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
}
