package com.isban.spring.mvc.domain;

public class Arco extends Arma {

	public void empuñar(){
		System.out.print("\tcon el arco: ");
		System.out.println("fiuuuuun, fiuuuuun");
		System.out.println("\t\t--> con un alcance de " + getAlcance() + " metros");
	}

}
