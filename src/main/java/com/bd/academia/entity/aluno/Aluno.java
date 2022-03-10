package com.bd.academia.entity.aluno;

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

import com.bd.academia.entity.controleEntrada.ControleEntrada;

import com.bd.academia.entity.fichaTreino.FichaTreino;
import com.bd.academia.entity.pessoa.Pessoa;
import com.bd.academia.entity.planoAcademia.PlanoAcademia;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "aluno")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Aluno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(name = "idaluno")
    private long idaluno;
    
    @Getter
    @Setter
    @Column(name = "token" ,nullable = false, length = 50)
    private String token;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "idplano",  nullable = false)
    private PlanoAcademia plano_academia;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "idpessoa", nullable = false)
    private Pessoa pessoa;
    
    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
    private List<ControleEntrada> controle_entrada;

    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
    private List<FichaTreino> fichatreino;


 


   





}
