package com.walterfcarvalho.cursouml.resources;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.walterfcarvalho.cursouml.domain.Categoria;;

@RestController 
@RequestMapping(value="categorias")
public class CategoriaResource {

    @GetMapping
    public List<Categoria> listar(){
        Categoria c1 = new Categoria(1, "Categoria 02");
        Categoria c2 = new Categoria(1, "Categoria 01");

        List<Categoria> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);

        return lista;
    }
}
