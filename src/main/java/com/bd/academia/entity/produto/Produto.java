package com.bd.academia.entity.produto;

import java.sql.Date;
import java.sql.Timestamp;
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
@Table(name = "produto")
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idProduto;
    private long idAcademia;
    //fazer chave composta idProduto e idAcademia
    
    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private Integer quantidade;

    @Getter
    @Setter
    @OneToMany(mappedBy = "produto", fetch = FetchType.LAZY)
    private List<Academia> academias;


    
}
