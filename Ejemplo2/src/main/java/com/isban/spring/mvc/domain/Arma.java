package com.isban.spring.mvc.domain;

import com.isban.spring.mvc.service.IArma;

public abstract class Arma implements IArma {

	protected int alcance;
	protected String tipo;
		
	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
