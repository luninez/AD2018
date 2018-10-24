package com.lbenitez.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//import com.lbenitez.spring.clases.Categoria;
import com.lbenitez.spring.clases.Producto;
import com.lbenitez.spring.service.ProductoService;

@SpringBootApplication
public class CatalogoProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoProductosApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner init(ProductoService pService) {
		return args -> {
			pService.insert(new Producto("Toallitas", "Papel humedo", 2.00));//, new Categoria("Toallitas")));
			pService.insert(new Producto("Papel de culo", "Papel de aseo personal", 2.00));//, new Categoria("Papel")));
		};
	}

	
}
