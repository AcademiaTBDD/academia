package com.bd.academia.controller.endereco;

import java.util.Optional;

import com.bd.academia.entity.endereco.Endereco;
import com.bd.academia.service.endereco.ServEndereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/endereco")
public class EnderecoController {

    @Autowired
    private ServEndereco servEndereco;

    @PostMapping()
    public ResponseEntity<Endereco> salvarEndereco(@RequestBody Endereco endereco) {
        Endereco newEndereco = servEndereco.salvarEndereco(endereco);

        return new ResponseEntity<Endereco>(newEndereco, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> recuperarEndereco(@PathVariable long id) {
        Optional<Endereco> enderecos = servEndereco.recuperarEndereco(id);

        return new ResponseEntity<>(enderecos, HttpStatus.OK);
    }

}
