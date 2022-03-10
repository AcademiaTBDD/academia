package com.bd.academia.entity.controleEntrada;


import java.util.Date ;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.bd.academia.entity.academia.Academia;
import com.bd.academia.entity.aluno.Aluno;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "controle_entrada")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })


public class ControleEntrada {


   


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(name = "idcontrole")
    private long idcontrole;
    

    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    @Column(name = "datahora_saida" , nullable = true)
    private Date datahora_saida;


    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    @Column(name = "datahora_entrada" ,nullable = true)
    private Date datahora_entrada;


    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "idaluno",  nullable = false)
    private Aluno aluno;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "idacademia",  nullable = false)
    private Academia academia;


    

}
