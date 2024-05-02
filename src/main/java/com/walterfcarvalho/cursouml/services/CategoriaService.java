package com.walterfcarvalho.cursouml.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walterfcarvalho.cursouml.domain.Categoria;
import com.walterfcarvalho.cursouml.respositories.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired //instancia automaticamente
    private CategoriaRepository catRepo;
    
    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = catRepo.findById(id);
        return obj.orElse(null);
    }

}
