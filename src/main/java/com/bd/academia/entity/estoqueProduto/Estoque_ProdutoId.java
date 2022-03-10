package com.bd.academia.entity.estoqueProduto;

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



public class Estoque_ProdutoId implements Serializable{
    
    
    @EqualsAndHashCode.Include
    @Getter
    private Long idproduto;

    @EqualsAndHashCode.Include
    @Getter
    private Long idacademia;
}
