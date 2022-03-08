package com.bd.academia.entity.professor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bd.academia.entity.pessoa.Pessoa;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "professor")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Professor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idProfessor;

    @Getter
    @Setter
    @Column(nullable = false)
    private double salario;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String periodo;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String formacao;

     //fazer a foreign key idendereco

    @Getter
    @Setter
    @JsonIgnore
    @ManyToOne
    @JoinColumn (name="idPessoa", referencedColumnName = "idPessoa")
    private Pessoa pessoa;
    
}
