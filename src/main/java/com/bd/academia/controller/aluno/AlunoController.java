package com.bd.academia.controller.aluno;
import com.bd.academia.service.aluno.ServAluno;

import java.util.List;

import com.bd.academia.entity.aluno.Aluno;

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
@RequestMapping("api/aluno")
public class AlunoController {
    @Autowired
    private ServAluno ServAluno;

    @PostMapping()
    public ResponseEntity<Aluno> cadastrar(@RequestBody Aluno aluno) {
        Aluno newAluno = ServAluno.cadastrar(aluno);

        return new ResponseEntity<Aluno>(newAluno, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Aluno>> recuperarTodos() {
        List<Aluno> alunos = ServAluno.recuperarTodos();

        return new ResponseEntity<List<Aluno>>(alunos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> recuperarPorId(@PathVariable long id) {
        Aluno aluno = ServAluno.recuperarPorId(id);

        return new ResponseEntity<Aluno>(aluno, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Aluno> atualizar(@RequestBody Aluno aluno) {
        Aluno alunoAtualizado = ServAluno.atualizar(aluno);

        return new ResponseEntity<Aluno>(alunoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable long id) {
        String message = ServAluno.remover(id);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
}
