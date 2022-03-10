package com.bd.academia.service.academia;

import java.util.List;

import com.bd.academia.core.entity.ResourceNotFound;
import com.bd.academia.entity.academia.Academia;
import com.bd.academia.repository.academia.RepAcademia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServAcademia {
    
    @Autowired
    private RepAcademia repAcademia;

    public Academia cadastrar(Academia academia) {
        return repAcademia.saveAndFlush(academia);
    }

    public List<Academia> recuperarTodos() {
        return repAcademia.findAll();
    }

    public Academia recuperarPorId(long id) {
        
        try {
            Academia academia = repAcademia.getById(id);
            return academia;
           } catch (Exception e) {
            throw  new ResourceNotFound("Academia não encontrado: " + id);
           }
           
    }

    public Academia atualizar(Academia academia) {
        validaAcademiaById(academia.getIdacademia());
        return cadastrar(academia);
    }

    public String remover(long id) {
        validaAcademiaById(id);
        repAcademia.deleteById(id);
        return "Academia removida com sucesso!";
    }   

    public void validaAcademiaById(long id) {
       try {
        Academia academiaAtual = recuperarPorId(id);
         academiaAtual.getIdacademia();
       } catch (Exception e) {
        throw  new ResourceNotFound("Academia não encontrado: " + id);
       }
    }
}
