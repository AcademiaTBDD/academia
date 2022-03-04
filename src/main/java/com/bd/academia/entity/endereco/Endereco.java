package com.bd.academia.entity.endereco;

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
@Table(name = "endereco")
@AllArgsConstructor
@NoArgsConstructor
public class Endereco extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idEndereco;
    
    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String cep;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String cidade;

    @Getter
    @Setter
    @Column(nullable = false, length = 50 )
    private String bairro;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String rua;

    @Getter
    @Setter
    @Column(nullable = false, length = 2)
    private String uf;

    @Getter
    @Setter
    @OneToMany(mappedBy = "endereco", fetch = FetchType.LAZY)
    private List<Academia> academias;
}
