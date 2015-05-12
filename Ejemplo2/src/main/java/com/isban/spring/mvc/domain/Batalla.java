package com.isban.spring.mvc.domain;

public class Batalla {

	private String nombre;

	public void getNombre() {
		System.out.println("batalla de " + nombre);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
