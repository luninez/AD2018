package com.producto;

public class Producto {

	//ATRIBUTOS
	private int ID;
	private String nombre;
	private double precio;
	
	//CONSTRUCTORES
	public Producto () {
		ID = 00;
		nombre = " ";
		precio = 0.0;
	}
	
	public Producto (int ID, String nombre, double precio) {
		this.ID = ID;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//GETTERS Y SETTERS
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [ID = " + ID + ", nombre = " + nombre + ", precio = " + precio + "]";
	}
	
	
	
}
