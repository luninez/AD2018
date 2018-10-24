package com.lbenitez.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbenitez.spring.repository.PersonaRepository;

import com.lbenitez.spring.model.Persona;

@Service
public class PersonaService {

	//conectamos con el repositorio
	@Autowired
	private PersonaRepository repository;
	
	
	//metodos CRUDS
	public List<Persona> findAll() {
		return repository.findAll();
	}

	public void insert(Persona p) {
		repository.save(p);
	}
}
