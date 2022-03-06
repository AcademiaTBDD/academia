package com.bd.academia.entity.aluno;

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
@Table(name = "aluno")
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idAluno;
    
    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String cpf;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private long token;

    @Getter
    @Setter
    @Column(nullable = false, length = 50 )
    private Integer idade;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private Character sexo;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String nome;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String telefone;

     //fazer a foreign key idendereco e idplano

    // @Getter
    // @Setter
    // @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
    // private List<FichaTreino> fichaTreino;
    
}
