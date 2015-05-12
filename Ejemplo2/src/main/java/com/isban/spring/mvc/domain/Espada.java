package com.isban.spring.mvc.domain;

public class Espada extends Arma {

	private String material;
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void empuñar(){
		System.out.print("\tcon una espada hecha de " + material + " : ");
		System.out.println("waaaas, waaas");
		System.out.println("\t\t--> con un alcance de " + getAlcance() + " metros");
	}
}
