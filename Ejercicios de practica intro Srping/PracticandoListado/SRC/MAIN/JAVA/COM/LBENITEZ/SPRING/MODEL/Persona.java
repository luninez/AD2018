package com.lbenitez.spring.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //indicamos que es una entidad(tabla)
public class Persona {

	@Id //especificamos que este es el atributo primary key
	@GeneratedValue(strategy = GenerationType.AUTO) ///indicamos que genere automaticamente el valor de la PK y entre parentesis le indicamos la estrategia que queremos que use
	private Long ID;
	
	//atributos
	private String name;
	private String lastName;
	private String dni;
	
	//Constructores
	public Persona(String name, String lastName, String dni) {
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
	}
	
	public Persona() {}
	
	//getters y setters
	public Long getID() {
		return ID;
	}


	public void setID(Long iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}
	
	//metodos sobreescritos
	@Override
	public String toString() {
		return "Persona [ID=" + ID + ", name=" + name + ", lastName=" + lastName + ", dni=" + dni + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, name, lastName, dni);
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(obj, this);
	}
	
	
}
