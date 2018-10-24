package com.lbenitez.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lbenitez.spring.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

	
	
}