package com.lbenitez.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lbenitez.spring.model.Persona;
import com.lbenitez.spring.service.PersonaService;

@SpringBootApplication
public class PracticandoListadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticandoListadoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner init(PersonaService service) {
		return args -> {
			service.insert(new Persona("Lucia", "Benitez, Martinez", "77823833k"));
			service.insert(new Persona("Eva", "Benitez Martinez", "77823834E"));
		};
	}
}
