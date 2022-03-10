package com.bd.academia.entity.treino;



import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.bd.academia.entity.fichaTreino.FichaTreino;
import com.bd.academia.entity.treino.Treino;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "treino")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(name = "idtreino")
    private long idtreino;

    @Getter
    @Setter
    @Column(name = "nome_treino",nullable = false, length = 50)
    private String nomeTreino;


    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "treino", fetch = FetchType.LAZY)
    private List<FichaTreino> fichatreino;


    
}
