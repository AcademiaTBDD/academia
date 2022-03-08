package com.bd.academia.repository.controleEntrada;

import java.util.List;

import com.bd.academia.entity.controleEntrada.ControleEntrada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface RepControleEntrada extends JpaRepository<ControleEntrada, Long> {


    @Query(value = "select ct from controle_entrada ct ", nativeQuery = true)
    List<ControleEntrada> findEntradas();
    

}
