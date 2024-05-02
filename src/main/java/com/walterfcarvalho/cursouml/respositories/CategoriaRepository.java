package com.walterfcarvalho.cursouml.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.walterfcarvalho.cursouml.domain.*;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
}
