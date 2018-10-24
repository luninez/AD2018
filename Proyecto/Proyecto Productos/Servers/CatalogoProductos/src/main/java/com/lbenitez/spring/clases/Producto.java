package com.lbenitez.spring.clases;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.lbenitez.spring.clases.Categoria;

@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	private String descripcion;
	private double precio;
	private Categoria categoria;
	
	//CONSTRUCTORES
	public Producto() {}
	
	public Producto(Long id, String nombre, String decripcion, double precio, Categoria categoria) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = decripcion;
		this.precio = precio;
		this.categoria = categoria;
	}

	//GETTERS & SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDecripcion() {
		return descripcion;
	}

	public void setDecripcion(String decripcion) {
		this.descripcion = decripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", decripcion=" + descripcion + ", precio=" + precio
				+ ", categoria=" + categoria + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, descripcion, precio, categoria);
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(obj, this);
	}
	
}
