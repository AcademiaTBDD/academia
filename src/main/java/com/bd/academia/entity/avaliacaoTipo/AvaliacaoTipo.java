package com.bd.academia.entity.avaliacaoTipo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bd.academia.entity.avaliacaoFisica.AvaliacaoFisica;
import com.bd.academia.entity.tipoAvFisica.TipoAvFisica;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@IdClass(AvaliacaoTipoID.class)
@Table(name = "avaliacao_tipo")
@AllArgsConstructor
@NoArgsConstructor

public class AvaliacaoTipo {
    
    @Id
    @Getter
    private long id_avaliacao;
    @ManyToOne
    @JoinColumn(name = "idavaliacao", nullable = false, insertable = false, updatable = false )
    private AvaliacaoFisica avaliacao_fisica;



    @Id
    @Getter
    private long id_tipo_av;
    @ManyToOne
    @JoinColumn(name = "id_tipo_av", nullable = false, insertable = false, updatable = false )
    private TipoAvFisica tipo_av_fisica;


    @Getter
    @Setter
    @Column(nullable = false)
    private float quantidade;
}
