package com.bd.academia.controller.academia;

import java.util.List;

import com.bd.academia.entity.academia.Academia;
import com.bd.academia.service.academia.ServAcademia;

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
@RequestMapping("api/academia")
public class AcademiaController {
    
    @Autowired
    private ServAcademia servAcademia;

    @PostMapping()
    public ResponseEntity<Academia> salvarAcademia(@RequestBody Academia academia) {
        Academia newAcademia = servAcademia.cadastrar(academia);

        return new ResponseEntity<Academia>(newAcademia, HttpStatus.CREATED);
    }
    @GetMapping()
    public ResponseEntity<List<Academia>> recuperarTodos() {
        List<Academia> academias = servAcademia.recuperarTodos();

        return new ResponseEntity<List<Academia>>(academias, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Academia> recuperarPorId(@PathVariable long id) {
        Academia academia = servAcademia.recuperarPorId(id);

        return new ResponseEntity<Academia>(academia, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Academia> atualizar(@RequestBody Academia academia) {
        Academia academiaAtualizado = servAcademia.atualizar(academia);

        return new ResponseEntity<Academia>(academiaAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable long id) {
        String message = servAcademia.remover(id);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
}
