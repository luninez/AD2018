package com.producto;

//El servicio sería la parte de la gestora con los metodos más especificos de la aplicacion

import java.util.ArrayList;
import java.util.List;

//librerias framework
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	//public List<Producto> encontrarProductosCaros() 
	
	public List<Producto> encontrarProductosCaros() {
		List<Producto> listaCaro = new ArrayList<Producto>();
		
		for(Producto p : productoRepository.findAll()) {
			if(p.getPrecio() >= 100) {
				listaCaro.add(p);
			}
		}
		
		return listaCaro;
	}
	
}
