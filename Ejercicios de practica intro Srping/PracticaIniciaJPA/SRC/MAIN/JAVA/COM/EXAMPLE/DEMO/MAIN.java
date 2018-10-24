package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class MAIN {
	
	private static final Logger log = LoggerFactory.getLogger(PracticaIniciaJpaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PracticaIniciaJpaApplication.class);
	}
		
		@Bean
		public CommandLineRunner  clientesApellidos (ClienteRepository repository) {
			return (args) -> {
				repository.save(new Cliente(0001, "Lucia", "Benitez"));
				repository.save(new Cliente(0001, "Eva", "Benitez"));
				repository.save(new Cliente(0001, "Carmen", "Berbel"));
				repository.save(new Cliente(0001, "Natalia", "Jimenez"));
				
				//recuperar todos los objetos
				System.out.println("Lista Clientes: ");
				
				for (Cliente Cliente : repository.findAll()) {
					log.info(Cliente.toString());
				}
				
				//recuperar todos los objetos con el apellido pasado por parametro
				repository.findByApellidos("Benitez").forEach(Benitez -> {
					log.info(Benitez.toString());
				});
				
			}; 
		}

}
