package com.lbenitez.rest.clases;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * Su ID (se autogenerará en la base de datos)
	El código de país (según el código ISO 3166-1 alfa 2).
	El nombre del país.
	El nombre de la ciudad.
	Su localización - cadena de caracteres: (latitud, longitud).
	El nombre del monumento
	Un descripción del mismo
	La URL de una foto.
 * 
 * */

@Entity
public class Monumento {

	@Id
	@GeneratedValue
	private Long id;
	
	private Long codeCountry;
	private String nameCountry;
	private String nameCity;
	private String latiLongi;
	private String nameMonument;
	private String descriptionMonument;
	private String photo;
	
	public Monumento() { }
	
	public Monumento(Long codeCountry, String nameCountry, String nameCity, String latiLongi,
			String nameMonument, String descriptionMonument, String photo) {
		this.codeCountry = codeCountry;
		this.nameCountry = nameCountry;
		this.nameCity = nameCity;
		this.latiLongi = latiLongi;
		this.nameMonument = nameMonument;
		this.descriptionMonument = descriptionMonument;
		this.photo = photo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodeCountry() {
		return codeCountry;
	}

	public void setCodeCountry(Long codeCountry) {
		this.codeCountry = codeCountry;
	}

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	public String getLatiLongi() {
		return latiLongi;
	}

	public void setLatiLongi(String latiLongi) {
		this.latiLongi = latiLongi;
	}

	public String getNameMonument() {
		return nameMonument;
	}

	public void setNameMonument(String nameMonument) {
		this.nameMonument = nameMonument;
	}

	public String getDescriptionMonument() {
		return descriptionMonument;
	}

	public void setDescriptionMonument(String descriptionMonument) {
		this.descriptionMonument = descriptionMonument;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Monumento [id=" + id + ", codeCountry=" + codeCountry + ", nameCountry=" + nameCountry + ", nameCity="
				+ nameCity + ", latiLongi=" + latiLongi + ", nameMonument=" + nameMonument + ", descriptionMonument="
				+ descriptionMonument + ", photo=" + photo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,  codeCountry, nameCity, nameCity, latiLongi, nameMonument, descriptionMonument, photo);
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(obj, this);
	}
	
	
	
}
