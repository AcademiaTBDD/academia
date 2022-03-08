package com.bd.academia.repository.planoAcademia;

import com.bd.academia.entity.planoAcademia.PlanoAcademia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepPlanoAcademia extends JpaRepository<PlanoAcademia , Long>{

    
}
