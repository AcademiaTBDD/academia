package com.bd.academia.controller.academia;

import com.bd.academia.entity.academia.Academia;
import com.bd.academia.service.academia.ServAcademia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/academia")
public class AcademiaController {
    
    @Autowired
    private ServAcademia servAcademia;

    @PostMapping()
    public ResponseEntity<Academia> salvarAcademia(@RequestBody Academia academia) {
        Academia newAcademia = servAcademia.salvarAcademia(academia);

        return new ResponseEntity<Academia>(newAcademia, HttpStatus.CREATED);
    }
}
