package com.lbenitez.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j //esto se usa para dejar registro de lo que se va haciendo, equivale a escribir por consola
public class LoadDatabase {

	@Bean
	public CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args -> {
			System.out.println("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
			System.out.println("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
		};
	}
	
}
