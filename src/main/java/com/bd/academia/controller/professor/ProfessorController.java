package com.bd.academia.controller.professor;

import java.util.List;

import com.bd.academia.entity.professor.Professor;
import com.bd.academia.service.professor.ServProfessor;

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
@RequestMapping("api/professor")

public class ProfessorController {

    @Autowired
    private ServProfessor servProfessor;

    @PostMapping()
    public ResponseEntity<Professor> cadastrar(@RequestBody Professor professor) {
        Professor newProfessor = servProfessor.cadastrar(professor);

        return new ResponseEntity<Professor>(newProfessor, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Professor>> recuperarTodos() {
        List<Professor> professores = servProfessor.recuperarTodos();

        return new ResponseEntity<List<Professor>>(professores, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> recuperarPorId(@PathVariable long id) {
        Professor professor = servProfessor.recuperarPorId(id);

        return new ResponseEntity<Professor>(professor, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Professor> atualizar(@RequestBody Professor professor) {
        Professor professorAtualizado = servProfessor.atualizar(professor);

        return new ResponseEntity<Professor>(professorAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable long id) {
        String message = servProfessor.remover(id);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
}
