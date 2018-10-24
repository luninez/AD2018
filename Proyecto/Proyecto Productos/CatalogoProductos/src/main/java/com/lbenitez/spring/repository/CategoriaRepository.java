package com.lbenitez.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lbenitez.spring.clases.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
