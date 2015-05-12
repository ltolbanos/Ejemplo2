package com.isban.spring.mvc.domain;

public class GuerreroElfo extends Guerrero {
	
	private String nombre;

	public void hablar(){
		System.out.println("\"Sí, mi señor!\"");
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}
		
	public String getNombre(){
		return nombre;
	}
	
	public void atacar(){
		System.out.print("El " + getRaza() + " " + nombre + " ataca: ");
		arma.empuñar();
	}
	
}
