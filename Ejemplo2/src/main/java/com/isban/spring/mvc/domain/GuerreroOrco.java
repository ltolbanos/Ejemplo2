package com.isban.spring.mvc.domain;

public class GuerreroOrco extends Guerrero {
	
	public void hablar() {
		System.out.println("\"Grrrrr, grrrrr\"");
	}
	
	public void atacar(){
		System.out.println("El " + getRaza() + " ataca: ");
		arma.empuñar();
	}

}
