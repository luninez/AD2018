package com.lbenitez.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lbenitez.rest.clases.Monumento;

public interface MonumentoRepository extends JpaRepository<Monumento, Long> {

}
