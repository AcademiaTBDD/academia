package com.bd.academia.entity.academia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bd.academia.core.entity.BaseEntity;
import com.bd.academia.entity.endereco.Endereco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "academia")
@AllArgsConstructor
@NoArgsConstructor
public class Academia extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idAcademia;
    
    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String nome;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String complemento;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String cnpj;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_endereco", nullable = false)
    private Endereco endereco;
}
