package com.bd.academia.entity.fichaTreino;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bd.academia.entity.aluno.Aluno;
import com.bd.academia.entity.professor.Professor;
import com.bd.academia.entity.treino.Treino;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ficha_treino")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class FichaTreino implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Date data_treino;



    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String divisao_treino;

    @Getter
    @Setter
    @Column(nullable = false)
    private long repeticoes;

    @Getter
    @Setter
    @Column(nullable = false)
    private long series;

    @Id
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_treino",  nullable = false)
    private Treino treino;

    @Id
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_aluno",  nullable = false)
    private Aluno aluno;


    @Id
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_professor",  nullable = false)
    private Professor professor;
}
