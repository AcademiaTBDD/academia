package com.bd.academia.entity.tipoAvFisica;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.bd.academia.entity.avaliacaoTipo.AvaliacaoTipo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipo_av_fisica")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class TipoAvFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_av")
    @Getter
    private long id_tipo_av;


    @Getter
    @Setter
    @Column(name = "descricao",nullable = false, length = 50)
    private String descricao;

    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "tipo_av_fisica", fetch = FetchType.LAZY)
    private List<AvaliacaoTipo> avaliacao_tipo;


}
