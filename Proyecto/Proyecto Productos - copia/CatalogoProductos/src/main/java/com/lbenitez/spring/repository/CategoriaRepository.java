package com.lbenitez.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lbenitez.spring.clases.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
