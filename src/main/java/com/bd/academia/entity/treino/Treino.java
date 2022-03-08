package com.bd.academia.entity.treino;

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
    private long idTreino;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String nomeTreino;


    // @Getter
    // @Setter
    // @JsonIgnore
    // @ManyToOne
    // @JoinColumn (name="idTreino")
    // private ;


    
}
