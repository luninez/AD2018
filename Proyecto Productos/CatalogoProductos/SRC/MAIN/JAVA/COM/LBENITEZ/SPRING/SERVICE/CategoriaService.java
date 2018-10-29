package com.lbenitez.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbenitez.spring.repository.CategoriaRepository;
import com.lbenitez.spring.clases.Categoria;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository cRepository;
	
	public List<Categoria> findAll() {
		return cRepository.findAll();
	}
	
	public void insert(Categoria c) {
		cRepository.save(c);
	}
	
}
