package com.walterfcarvalho.cursouml;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.walterfcarvalho.cursouml.domain.Categoria;
import com.walterfcarvalho.cursouml.respositories.CategoriaRepository;

@SpringBootApplication
public class CursoumlApplication implements CommandLineRunner {
	@Autowired
	CategoriaRepository catRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoumlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "categoria 001 Informatica");
		Categoria cat2 = new Categoria(null, "categoria 002 escritório");

		catRepo.saveAll( Arrays.asList(cat1, cat2)  );

	}

	



}
