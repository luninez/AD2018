package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
	List<Cliente> findByApellidos(String apellidos);
	
}
