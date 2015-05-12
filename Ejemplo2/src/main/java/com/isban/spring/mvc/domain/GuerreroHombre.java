package com.isban.spring.mvc.domain;

public class GuerreroHombre extends Guerrero{
	
	private String nombre;
	
	public void hablar(){
		System.out.println("\"Sí mi general, a la orden\"");
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
		
	public String getNombre(){
		return nombre;
	}
	
	public void atacar(){
		System.out.println("El " + getRaza() + " " + nombre + " ataca: ");
		arma.empuñar();
	}

}
