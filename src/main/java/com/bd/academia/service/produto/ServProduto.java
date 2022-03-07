package com.bd.academia.service.produto;

import java.util.List;

import com.bd.academia.core.entity.ResourceNotFound;
import com.bd.academia.entity.produto.Produto;
import com.bd.academia.repository.produto.RepProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ServProduto {
    @Autowired
    private RepProduto repProduto;

    public Produto cadastrar(Produto produto) {
        return repProduto.saveAndFlush(produto);
    }

    public List<Produto> recuperarTodos() {
        return repProduto.findAll();
    }

    public Produto recuperarPorId(long id) {
        Produto pessoa = repProduto.getById(id);
        return pessoa;
    }

    public Produto atualizar(Produto produto) {
        validaProdutoById(produto.getIdProduto());

        return cadastrar(produto);
    }

    public String remover(long id) {
        validaProdutoById(id);

        repProduto.deleteById(id);

        return "Produto removido com sucesso!";
    }

    public void validaProdutoById(long id) {
        Produto produtoAtual = recuperarPorId(id);

        if (produtoAtual == null) {
            throw new ResourceNotFound("Produto não encontrado: " + id);
        }
    }

}
