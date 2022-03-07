package com.bd.academia.controller.estoqueProduto;

import com.bd.academia.entity.estoqueProduto.Estoque_Produto;
import com.bd.academia.service.estoqueProduto.ServEstoqueProduto;

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

import java.util.List;

@Controller
@RequestMapping("api/estoque_produto")
public class Estoque_ProdutoController {


    @Autowired
    private ServEstoqueProduto servEstoqueProduto;

    @PostMapping()
    public ResponseEntity<Estoque_Produto> cadastrar(@RequestBody Estoque_Produto estoque_Produto) {
        Estoque_Produto newEstoqueProduto = servEstoqueProduto.cadastrar(estoque_Produto);

        return new ResponseEntity<Estoque_Produto>(newEstoqueProduto, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Estoque_Produto>> recuperarTodos() {
        List<Estoque_Produto> estoque = servEstoqueProduto.recuperarTodos();

        return new ResponseEntity<List<Estoque_Produto>>(estoque, HttpStatus.OK);
    }


    @PutMapping()
    public ResponseEntity<Estoque_Produto> atualizar(@RequestBody Estoque_Produto endereco) {
        Estoque_Produto estoqueAtualizado = servEstoqueProduto.atualizar(endereco);

        return new ResponseEntity<Estoque_Produto>(estoqueAtualizado, HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<String> remover(@RequestBody Estoque_Produto estoque_Produto) {
        String message = servEstoqueProduto.remover(estoque_Produto);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }


}


