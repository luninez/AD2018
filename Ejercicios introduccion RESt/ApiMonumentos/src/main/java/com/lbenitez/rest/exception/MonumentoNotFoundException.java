package com.lbenitez.rest.exception;

public class MonumentoNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public MonumentoNotFoundException(Long id) {
		super("Monumento no encontrado");
	}

	
	
}
