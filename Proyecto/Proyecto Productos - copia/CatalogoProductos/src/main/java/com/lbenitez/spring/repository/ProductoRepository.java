package com.lbenitez.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lbenitez.spring.clases.Producto;;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

	
	
}
