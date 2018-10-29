package com.lbenitez.rest.database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lbenitez.rest.clases.Monumento;
import com.lbenitez.rest.repository.MonumentoRepository;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LocalDataBase {

	@Bean
	public CommandLineRunner initDatabase(MonumentoRepository repository) {
		return args -> {
			System.out.println("Preloading " + repository.save(new Monumento(3166-2l, "Espania", "Sevilla", "geolocalizacion",
					"Catedral de Sevilla", "Se trata del templo gótico con mayor superficie del mundo. La Unesco la declaró en 1987, junto al Real Alcázar y el Archivo de Indias, Patrimonio de la Humanidad2​ y, el 25 de julio de 2010, Bien de Valor Universal Excepcional", "Enlace a la foto")));
			
		};
	}
	
}
