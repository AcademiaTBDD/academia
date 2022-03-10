package com.bd.academia.repository.fichaTreino;




import com.bd.academia.entity.fichaTreino.FichaTreino;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepFichaTreino extends JpaRepository<FichaTreino, Long> {
    
}
