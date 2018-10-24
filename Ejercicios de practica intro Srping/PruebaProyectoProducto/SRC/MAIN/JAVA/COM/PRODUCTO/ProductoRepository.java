package com.producto;

import java.util.Arrays;
import java.util.List;

//librerias framework
import org.springframework.stereotype.Repository;

@Repository
public class ProductoRepository {

	public List<Producto> findAll(){		
		return Arrays.asList(new Producto(01, "Ratón", 15.00), new Producto(02, "Teclado", 23.00), 
							new Producto(03, "Pantalla", 60.00), new Producto(04, "Ordenador", 300));
	}
	
}
