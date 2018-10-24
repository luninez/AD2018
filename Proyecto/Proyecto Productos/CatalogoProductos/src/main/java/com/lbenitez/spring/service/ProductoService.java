package com.lbenitez.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbenitez.spring.repository.ProductoRepository;
import com.lbenitez.spring.clases.Producto;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	public List<Producto> findAll() {
		return repository.findAll();
	}
	
	public void insert(Producto p) {
		repository.save(p);
	}
	
}
