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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Academia extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(name = "idacademia")
    private long idacademia;
    
    @Getter
    @Setter
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Getter
    @Setter
    @Column(name = "complemento", nullable = false, length = 50)
    private String complemento;

    @Getter
    @Setter
    @Column(name = "cnpj" , nullable = false, length = 50)
    private String cnpj;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "idendereco", nullable = false)
    private Endereco endereco;


    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "academia", fetch = FetchType.LAZY)
    private List<Estoque_Produto> estoque_produtos;


    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "academia", fetch = FetchType.LAZY)
    private List<ControleEntrada> controle_entrada;
}
