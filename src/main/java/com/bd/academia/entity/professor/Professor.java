package com.bd.academia.entity.professor;

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
@Table(name = "professor")
@AllArgsConstructor
@NoArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idProfessor;
    
    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String nomeProfessor;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private Integer idadeProfessor;

    @Getter
    @Setter
    @Column(nullable = false, length = 50 )
    private String telefone;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private Character sexo;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private Long salario;

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
    @OneToMany(mappedBy = "professor", fetch = FetchType.LAZY)
    private List<Academia> academias;
    
}
    

