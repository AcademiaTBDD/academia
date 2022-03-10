package com.bd.academia.entity.pessoa;


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

import com.bd.academia.entity.aluno.Aluno;
import com.bd.academia.entity.endereco.Endereco;
import com.bd.academia.entity.professor.Professor;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pessoa")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(name = "idpessoa")
    private long idPessoa;

    @Getter
    @Setter
    @Column(name = "nome" , nullable = false, length = 50)
    private String nome;

    @Getter
    @Setter
    @Column(name = "idade" , nullable = false)
    private long idade;

    @Getter
    @Setter
    @Column(name = "telefone" , nullable = false, length = 50)
    private String telefone;

    @Getter
    @Setter
    @Column(name = "cpf" , nullable = false, length = 50)
    private String cpf;

    @Getter
    @Setter
    @Column(name = "sexo" , nullable = false, length = 1)
    private Character sexo;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "idendereco", nullable = false)
    private Endereco endereco;

    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "pessoa", fetch = FetchType.LAZY)
    private List<Aluno> alunos;


    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "pessoa", fetch = FetchType.LAZY)
    private List<Professor> professores;
}
