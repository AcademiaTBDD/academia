package com.bd.academia.entity.tipoAvFisica;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.bd.academia.entity.avaliacaoTipo.AvaliacaoTipo;
import com.fasterxml.jackson.annotation.JsonIgnore;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipo_av_fisica")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class TipoAvFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id_tipo_av;


    @Getter
    @Setter
    @Column(nullable = false, length = 50)
    private String descricao;

    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "tipo_av_fisica", fetch = FetchType.LAZY)
    private List<AvaliacaoTipo> avaliacao_tipo;


}
