package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	private String nombre;
	private String apellidos;
	
	//GETTERS Y SETTERS
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	//CONSTRUCTORES
	public Cliente() {
		ID = null;
		nombre = " ";
		apellidos = " ";
	}

	public Cliente(long iD, String nombre, String apellidos) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	//METODOS SOBRECARGADOS
	@Override
	public String toString() {
		return "Cliente [ID = " + ID + ", nombre = " + nombre + ", apellidos = " + apellidos + "]";
	}
	
}
