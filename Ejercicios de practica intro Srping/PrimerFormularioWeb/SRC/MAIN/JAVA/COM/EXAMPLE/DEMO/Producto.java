package com.example.demo;

public class Producto {

	//ATRIBUTOS
	private String name;
	private double precio;
	
	//CONSTRUCTOR
	public Producto() {
		this.name = " ";
		this.precio = 0;
	}
	
	public Producto(String name, double precio) {
		this.name = name;
		this.precio = precio;
	}
	
	//GETTERS Y SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//METODOS
	@Override
	public String toString() {
		return "Producto [name = " + name + ", precio = " + precio + "]";
	}
	
	
}
