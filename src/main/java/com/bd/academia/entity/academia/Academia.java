package com.bd.academia.entity.academia;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bd.academia.core.entity.BaseEntity;
import com.bd.academia.entity.estoqueProduto.Estoque_Produto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.bd.academia.entity.controleEntrada.ControleEntrada;
import com.bd.academia.entity.endereco.Endereco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "academia")
@AllArgsConstructor
@NoArgsConstructor
public class Academia extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idAcademia;
    
    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String nome;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String complemento;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String cnpj;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_endereco", nullable = false)
    private Endereco endereco;


    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "academia", fetch = FetchType.LAZY)
    private List<Estoque_Produto> estoque_Produtos;


    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "academia", fetch = FetchType.LAZY)
    private List<ControleEntrada> controle_Entrada;
}
