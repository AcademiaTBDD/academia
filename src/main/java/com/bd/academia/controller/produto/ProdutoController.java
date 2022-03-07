package com.bd.academia.controller.produto;

import java.util.List;

import com.bd.academia.entity.produto.Produto;
import com.bd.academia.service.produto.ServProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("api/produto")
public class ProdutoController {

    @Autowired
    private ServProduto servProduto;

    @PostMapping()
    public ResponseEntity<Produto> cadastrar (@RequestBody Produto produto) {
        Produto newProduto = servProduto.cadastrar(produto);
        
        return new ResponseEntity<Produto>(newProduto, HttpStatus.OK);
    }
    @GetMapping()
    public ResponseEntity<List<Produto>> recuperarTodos() {
        List<Produto> pessoas = servProduto.recuperarTodos();

        return new ResponseEntity<List<Produto>>(pessoas, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Produto> recuperarPorId(@PathVariable long id) {
        Produto produto = servProduto.recuperarPorId(id);

        return new ResponseEntity<Produto>(produto, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Produto> atualizar(@RequestBody Produto produto) {
        Produto produtoAtualizado = servProduto.atualizar(produto);

        return new ResponseEntity<Produto>(produtoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable long id) {
        String message = servProduto.remover(id);

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
    
}
