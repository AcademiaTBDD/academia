package com.bd.academia.controller.planoAcademia;

import java.util.List;

import com.bd.academia.entity.planoAcademia.PlanoAcademia;
import com.bd.academia.service.planoAcademia.ServPlanoAcademia;

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
@RequestMapping("api/planoacademia")
public class PlanoAcademiaController {

    
    @Autowired
    private ServPlanoAcademia servPlanoAcademia;

    @PostMapping()
    public ResponseEntity<PlanoAcademia> cadastrar(@RequestBody PlanoAcademia planoAcademia) {
        PlanoAcademia newPlano = servPlanoAcademia.cadastrar(planoAcademia);

        return new ResponseEntity<PlanoAcademia>(newPlano, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<PlanoAcademia>> recuperarTodos() {
        List<PlanoAcademia> planos = servPlanoAcademia.recuperarTodos();

        return new ResponseEntity<List<PlanoAcademia>>(planos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanoAcademia> recuperarPorId(@PathVariable long id) {
        PlanoAcademia endereco = servPlanoAcademia.recuperarPorId(id);

        return new ResponseEntity<PlanoAcademia>(endereco, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<PlanoAcademia> atualizar(@RequestBody PlanoAcademia planoAcademia) {
        PlanoAcademia planoAtualizado = servPlanoAcademia.atualizar(planoAcademia);

        return new ResponseEntity<PlanoAcademia>(planoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable long id) {
        String message = servPlanoAcademia.remover(id);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }

}
