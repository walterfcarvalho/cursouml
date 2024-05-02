package com.walterfcarvalho.cursouml.resources;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.walterfcarvalho.cursouml.domain.Categoria;
import com.walterfcarvalho.cursouml.services.CategoriaService;

import org.springframework.web.bind.annotation.RequestParam;
;

@SuppressWarnings("unused")
@RestController 
@RequestMapping(value="categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService catService;

    @GetMapping("/{id}")
    public  ResponseEntity<?> find(@PathVariable Integer id){

        Categoria catObj = catService.buscar(id);

        return ResponseEntity.ok().body(catObj);
    }
}
