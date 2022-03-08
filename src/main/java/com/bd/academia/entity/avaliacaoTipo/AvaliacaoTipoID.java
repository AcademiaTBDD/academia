package com.bd.academia.entity.avaliacaoTipo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@EqualsAndHashCode(onlyExplicitlyIncluded = true)


public class AvaliacaoTipoID  implements Serializable{


    @EqualsAndHashCode.Include
    @Getter
    private Long id_avaliacao;

    @EqualsAndHashCode.Include
    @Getter
    private Long id_tipo_av;

}
