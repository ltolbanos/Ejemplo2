package com.isban.spring.mvc.domain;

public class Maza extends Arma {

	public void empuñar() {
		System.out.print("\tcon la maza: ");
		System.out.println("plonk, plonk");
		System.out.println("\t\t--> con un alcance de " + getAlcance() + " metros");
	}

}
