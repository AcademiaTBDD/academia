package com.bd.academia.entity.controleEntrada;

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
@Table(name = "controleEntrada")
@AllArgsConstructor
@NoArgsConstructor
public class controleEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idControle;
    //fazer foreign keys idAluno e idAcademia
    
    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private Timestamp dataHoraSaida;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private Timestamp dataHoraEntrada;

    @Getter
    @Setter
    @OneToMany(mappedBy = "controleEntrada", fetch = FetchType.LAZY)
    private List<Academia> academias;
    
}
