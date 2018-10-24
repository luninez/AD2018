package com.lbenitez.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lbenitez.spring.clases.Categoria;
import com.lbenitez.spring.clases.Producto;
import com.lbenitez.spring.service.ProductoService;
import com.lbenitez.spring.service.CategoriaService;

@SpringBootApplication
public class CatalogoProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoProductosApplication.class, args);
	}
	
	Categoria cat1 = new Categoria("Toallitas");
	Categoria cat2 = new Categoria("Papel de culo");
	
	@Bean
	public CommandLineRunner init(ProductoService pService) {
		return args -> {
			pService.insert(new Producto("Toallitas", "Papel humedo", 2.00, cat1));
			pService.insert(new Producto("Papel de culo", "Papel de aseo personal", 2.00, cat2));
		};
	}
	
	@Bean
	public CommandLineRunner init(CategoriaService cService) {
		return args -> {
			cService.insert(cat1);
			cService.insert(cat2);
		};
	}
	
}
