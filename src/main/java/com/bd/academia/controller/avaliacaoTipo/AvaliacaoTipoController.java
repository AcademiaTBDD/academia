package com.bd.academia.controller.avaliacaoTipo;

import java.util.List;

import com.bd.academia.entity.avaliacaoTipo.AvaliacaoTipo;
import com.bd.academia.service.avaliacaoTipo.ServAvaliacaoTipo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/avaliacaotipo")
public class AvaliacaoTipoController {


    @Autowired
    private ServAvaliacaoTipo servAvaliacaoTipo;

    @PostMapping()
    public ResponseEntity<AvaliacaoTipo> cadastrar(@RequestBody AvaliacaoTipo avaliacaoTipo) {
        AvaliacaoTipo newavaliacaoTipo = servAvaliacaoTipo.cadastrar(avaliacaoTipo);

        return new ResponseEntity<AvaliacaoTipo>(newavaliacaoTipo, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<AvaliacaoTipo>> recuperarTodos() {
        List<AvaliacaoTipo> avaliacaoTipo = servAvaliacaoTipo.recuperarTodos();

        return new ResponseEntity<List<AvaliacaoTipo>>(avaliacaoTipo, HttpStatus.OK);
    }


    @PutMapping()
    public ResponseEntity<AvaliacaoTipo> atualizar(@RequestBody AvaliacaoTipo avaliacaoTipo) {
        AvaliacaoTipo avaliacaoTipoAtualizado = servAvaliacaoTipo.atualizar(avaliacaoTipo);

        return new ResponseEntity<AvaliacaoTipo>(avaliacaoTipoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<String> remover(@RequestBody AvaliacaoTipo avaliacaoTipo) {
        String message = servAvaliacaoTipo.remover(avaliacaoTipo);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }


}

