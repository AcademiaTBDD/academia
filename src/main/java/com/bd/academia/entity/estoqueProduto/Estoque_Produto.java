package com.bd.academia.entity.estoqueProduto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bd.academia.entity.academia.Academia;
import com.bd.academia.entity.produto.Produto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@IdClass(Estoque_ProdutoId.class)
@Table(name = "estoque_produto")
@AllArgsConstructor
@NoArgsConstructor


public class Estoque_Produto  {

    @Id
    @Getter
    private long id_produto;
    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false, insertable = false, updatable = false )
    private Produto produto;



    @Id
    @Getter
    private long id_academia;
    @ManyToOne
    @JoinColumn(name = "id_academia", nullable = false, insertable = false, updatable = false )
    private Academia academia;


    @Getter
    @Setter
    @Column(nullable = false)
    private long quantidade;




    


    

}
