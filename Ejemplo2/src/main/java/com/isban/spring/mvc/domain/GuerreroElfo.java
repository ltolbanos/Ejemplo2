package com.isban.spring.mvc.domain;

public class GuerreroElfo extends Guerrero {
	
	private String nombre;

	public void hablar(){
		System.out.println("\"S�, mi se�or!\"");
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}
		
	public String getNombre(){
		return nombre;
	}
	
	public void atacar(){
		System.out.print("El " + getRaza() + " " + nombre + " ataca: ");
		arma.empu�ar();
	}
	
}
