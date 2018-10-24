package com.producto;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.producto")
public class AppConfiguration {
	
	//Aqui tambien podemos crear los beans para despues utilizarlos en el main
	/*@Bean
	public Producto preoducto() {
		return new Producto();
	}*/
	
}
