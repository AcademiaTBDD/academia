package com.bd.academia.entity.tipoAvFisica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipoAvFisica")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class TipoAvFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idTipoAvFisica;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String descricao;

    // @Getter
    // @Setter
    // @JsonIgnore
    // @ManyToOne
    // @JoinColumn (name="idPessoa", referencedColumnName = "idPessoa")
    // private Pessoa pessoa;
}
