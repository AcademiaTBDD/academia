package com.bd.academia.entity.endereco;

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
import com.bd.academia.entity.pessoa.Pessoa;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "endereco")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Endereco extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idendereco")
    @Getter
    private long idEndereco;

    @Getter
    @Setter
    @Column(name = "cep",nullable = false, length = 50)
    private String cep;

    @Getter
    @Setter
    @Column(name = "cidade", nullable = false, length = 50)
    private String cidade;

    @Getter
    @Setter
    @Column(name = "bairro", nullable = false, length = 50)
    private String bairro;

    @Getter
    @Setter
    @Column(name = "rua", nullable = false, length = 50)
    private String rua;

    @Getter
    @Setter
    @Column(name = "uf", nullable = false, length = 2)
    private String uf;

    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "endereco", fetch = FetchType.LAZY)
    private List<Academia> academias;

    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "endereco", fetch = FetchType.LAZY)
    private List<Pessoa> pessoas;
}
