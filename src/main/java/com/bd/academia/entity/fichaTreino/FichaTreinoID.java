package com.bd.academia.entity.fichaTreino;

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


public class FichaTreinoID implements Serializable{


  
    @EqualsAndHashCode.Include
    @Getter
    private Long idaluno;

    @EqualsAndHashCode.Include
    @Getter
    private Long data_treino;

    @EqualsAndHashCode.Include
    @Getter
    private Long idtreino;
}
