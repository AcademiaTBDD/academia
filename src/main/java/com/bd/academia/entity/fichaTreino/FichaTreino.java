package com.bd.academia.entity.fichaTreino;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
@IdClass(FichaTreinoID.class)
@Table(name = "ficha_treino")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class FichaTreino {


    @Id
    @Getter
    @Column(name = "data_treino")
    private Date data_treino;



    @Getter
    @Setter
    @Column(name = "divisao_treino" , nullable = false, length = 50)
    private String divisao_treino;

    @Getter
    @Setter
    @Column(name = "repeticoes" ,nullable = false)
    private long repeticoes;

    @Getter
    @Setter
    @Column(name = "series" , nullable = false)
    private long series;

    @Id
    @Getter
    @Setter
    private long idtreino;
    @ManyToOne
    @JoinColumn(name = "idtreino",  nullable = false, insertable = false, updatable = false )
    private Treino treino;

    @Id
    @Getter
    @Setter
    private long idaluno;
    @ManyToOne
    @JoinColumn(name = "idaluno",  nullable = false, insertable = false, updatable = false )
    private Aluno aluno;


    
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "idprofessor",  nullable = false, insertable = false, updatable = false )
    private Professor professor;
}
