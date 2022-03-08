package com.bd.academia.entity.planoAcademia;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bd.academia.entity.aluno.Aluno;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Entity
@Table(name = "plano_academia")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class PlanoAcademia {
    


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long idPlano;

    @Getter
    @Setter
    @Column(nullable = false)
    private float valor_plano;

    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String tipo_plano;


    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "plano_academia", fetch = FetchType.LAZY)
    private List<Aluno> alunos;

}
