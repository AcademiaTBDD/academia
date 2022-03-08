package com.bd.academia.controller.tipoAvFisica;

import java.util.List;

import com.bd.academia.entity.tipoAvFisica.TipoAvFisica;
import com.bd.academia.service.tipoAvFisica.ServTipoAvFisica;

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
@RequestMapping("api/tipoAvFisica")
public class TipoAvFisicaController {

    @Autowired
    private ServTipoAvFisica servTipoAvFisica;

    @PostMapping()
    public ResponseEntity<TipoAvFisica> cadastrar(@RequestBody TipoAvFisica tipoAvFisica) {
        TipoAvFisica newTipoAvFisica = servTipoAvFisica.cadastrar(tipoAvFisica);

        return new ResponseEntity<TipoAvFisica>(newTipoAvFisica, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<TipoAvFisica>> recuperarTodos() {
        List<TipoAvFisica> tipoAvFisicas = servTipoAvFisica.recuperarTodos();

        return new ResponseEntity<List<TipoAvFisica>>(tipoAvFisicas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoAvFisica> recuperarPorId(@PathVariable long id) {
        TipoAvFisica tipoAvFisica = servTipoAvFisica.recuperarPorId(id);

        return new ResponseEntity<TipoAvFisica>(tipoAvFisica, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<TipoAvFisica> atualizar(@RequestBody TipoAvFisica tipoAvFisica) {
        TipoAvFisica tipoAvFisicaAtualizado = servTipoAvFisica.atualizar(tipoAvFisica);

        return new ResponseEntity<TipoAvFisica>(tipoAvFisicaAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable long id) {
        String message = servTipoAvFisica.remover(id);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
    
}
