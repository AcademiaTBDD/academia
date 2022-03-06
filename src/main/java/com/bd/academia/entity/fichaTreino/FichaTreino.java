package com.bd.academia.entity.fichaTreino;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bd.academia.core.entity.BaseEntity;
import com.bd.academia.entity.academia.Academia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "fichaTreino")
@AllArgsConstructor
@NoArgsConstructor
public class fichaTreino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idTreino;
    private long idAluno;
    private long idProfessor; //fazer chave composta
    
    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private Date dataTreino;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String divisaoTreino;

    @Getter
    @Setter
    @Column(nullable = false, length = 50 )
    private Integer repeticoes;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private Integer series;

     //fazer a chave composta

    @Getter
    @Setter
    @OneToMany(mappedBy = "fichaTreino", fetch = FetchType.LAZY)
    private List<Academia> academias;
    
}
