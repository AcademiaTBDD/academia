package com.bd.academia.service.academia;

import com.bd.academia.entity.academia.Academia;
import com.bd.academia.repository.academia.RepAcademia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServAcademia {
    
    @Autowired
    private RepAcademia repAcademia;

    public Academia salvarAcademia(Academia academia) {
        return repAcademia.saveAndFlush(academia);
    }
}
