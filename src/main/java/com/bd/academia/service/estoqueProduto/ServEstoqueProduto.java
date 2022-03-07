package com.bd.academia.service.estoqueProduto;

import java.util.List;


import com.bd.academia.entity.estoqueProduto.Estoque_Produto;
import com.bd.academia.repository.estoqueProduto.RepEstoque_Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServEstoqueProduto {

    @Autowired
    private RepEstoque_Produto repEstoque_Produto;

    public Estoque_Produto cadastrar(Estoque_Produto estoque_Produto) {
       return repEstoque_Produto.saveAndFlush(estoque_Produto);
    }
    

    public List<Estoque_Produto> recuperarTodos() {
        return repEstoque_Produto.findAll();
    }

    public Estoque_Produto atualizar(Estoque_Produto estoque_Produto) {
        return cadastrar(estoque_Produto);
    }

   
    public String remover(Estoque_Produto estoque_Produto) {

        repEstoque_Produto.delete(estoque_Produto);;

        return "Produto removido com sucesso!";
    }
    
}
