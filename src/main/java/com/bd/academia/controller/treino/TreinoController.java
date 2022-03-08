package com.bd.academia.controller.treino;

import java.util.List;

import com.bd.academia.entity.treino.Treino;
import com.bd.academia.service.treino.ServTreino;

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
@RequestMapping("api/treino")
public class TreinoController {

    @Autowired
    private ServTreino servTreino;

    @PostMapping()
    public ResponseEntity<Treino> cadastrar(@RequestBody Treino treino) {
        Treino newTreino = servTreino.cadastrar(treino);

        return new ResponseEntity<Treino>(newTreino, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Treino>> recuperarTodos() {
        List<Treino> treinos = servTreino.recuperarTodos();

        return new ResponseEntity<List<Treino>>(treinos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Treino> recuperarPorId(@PathVariable long id) {
        Treino treino = servTreino.recuperarPorId(id);

        return new ResponseEntity<Treino>(treino, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Treino> atualizar(@RequestBody Treino treino) {
        Treino treinoAtualizado = servTreino.atualizar(treino);

        return new ResponseEntity<Treino>(treinoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable long id) {
        String message = servTreino.remover(id);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
    
}
