package com.bd.academia.controller.controleEntrada;

import java.util.List;

import com.bd.academia.entity.controleEntrada.ControleEntrada;
import com.bd.academia.service.controleEntrada.ServControleEntrada;

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
@RequestMapping("api/entradasaida")
public class ControleEntradaController {
    @Autowired
    private ServControleEntrada servControleEntrada;

    @PostMapping()
    public ResponseEntity<ControleEntrada> cadastrar(@RequestBody ControleEntrada controleEntrada) {
        ControleEntrada newControleEntrada = servControleEntrada.cadastrar(controleEntrada);

        return new ResponseEntity<ControleEntrada>(newControleEntrada, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<ControleEntrada>> findEntradas() {
        List<ControleEntrada> entradas_saidas = servControleEntrada.findEntradas();

        return new ResponseEntity<List<ControleEntrada>>(entradas_saidas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ControleEntrada> recuperarPorId(@PathVariable long id) {
        ControleEntrada entradas_saidas = servControleEntrada.recuperarPorId(id);

        return new ResponseEntity<ControleEntrada>(entradas_saidas, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<ControleEntrada> atualizar(@RequestBody ControleEntrada entradas_saidas) {
        ControleEntrada entradaSaidaAtualizado = servControleEntrada.atualizar(entradas_saidas);

        return new ResponseEntity<ControleEntrada>(entradaSaidaAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable long id) {
        String message = servControleEntrada.remover(id);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
}
