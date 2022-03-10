package com.bd.academia.entity.professor;

import java.io.Serializable;
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

import com.bd.academia.entity.fichaTreino.FichaTreino;
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

public class Professor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(name = "idprofessor")
    private long idprofessor;

    @Getter
    @Setter
    @Column(name = "salario" , nullable = false)
    private double salario;

    @Getter
    @Setter
    @Column(name = "periodo" , nullable = false, length = 50)
    private String periodo;

    @Getter
    @Setter
    @Column(name = "formacao" , nullable = false, length = 50)
    private String formacao;




    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "idpessoa", nullable = false)
    private Pessoa pessoa;

    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "professor", fetch = FetchType.LAZY)
    private List<FichaTreino> ficha_treino;
    
}
