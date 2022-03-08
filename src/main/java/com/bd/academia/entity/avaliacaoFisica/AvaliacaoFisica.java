package com.bd.academia.entity.avaliacaoFisica;

import java.util.Date;
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
import com.bd.academia.entity.avaliacaoTipo.AvaliacaoTipo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "avaliacao_fisica")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class AvaliacaoFisica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idavaliacao;


    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_aluno",  nullable = false)
    private Aluno aluno;


   
    @Getter
    @Setter
    @Column(nullable = false)
    private Date datahora_entrada;


    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "avaliacao_fisica", fetch = FetchType.LAZY)
    private List<AvaliacaoTipo> avaliacao_tipo;
}
