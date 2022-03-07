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

import com.bd.academia.core.entity.BaseEntity;
import com.bd.academia.entity.academia.Academia;
import com.bd.academia.entity.endereco.Endereco;
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
    private long idPessoa;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String nome;

    @Getter
    @Setter
    @Column(nullable = false)
    private long idade;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String telefone;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String cpf;

    @Getter
    @Setter
    @Column(nullable = false, length = 1)
    private Character sexo;

    @Getter
    @Setter
    @JsonIgnore
    @ManyToOne
    @JoinColumn (name="idEndereco", referencedColumnName = "idEndereco")
    private Endereco endereco;
}
