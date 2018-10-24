package com.producto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MAIN {

	public static void main(String[] args) {
		
		//abrimos framework
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		ProductoService productoService = (ProductoService) appContext.getBean(ProductoService.class);
		
		for (Producto pintar : productoService.encontrarProductosCaros()) {
			System.out.println(pintar.toString());
			}
		
		//cerramos framework
		((AnnotationConfigApplicationContext) appContext).close();
		
	}

}
