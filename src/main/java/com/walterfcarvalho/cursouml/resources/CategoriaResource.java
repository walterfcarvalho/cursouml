package com.walterfcarvalho.cursouml.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value="categorias")
public class CategoriaResource {

    @GetMapping
    public String listar(){
        return "rest está ok ! ";
    }
}
