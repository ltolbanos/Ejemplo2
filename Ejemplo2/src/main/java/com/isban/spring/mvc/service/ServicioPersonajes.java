package com.isban.spring.mvc.service;

import java.util.List;

public class ServicioPersonajes implements IServicioPersonajes {

	private List<IGuerrero> personajes;

	public List<IGuerrero> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(List<IGuerrero> personajes) {
		this.personajes = personajes;
	}
}
