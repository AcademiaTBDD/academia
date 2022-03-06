package com.bd.academia.entity.avaliacaoFisica;

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
@Table(name = "avaliacaoFisica")
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idAvaliacao;
    
    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private Date dataAvaliacao;


     //fazer a chave estrangeira idAluno

    // @Getter
    // @Setter
    // @OneToMany(mappedBy = "avaliacaoFisica", fetch = FetchType.LAZY)
    // private List<Academia> academias;
    
}
