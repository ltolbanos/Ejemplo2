package com.isban.spring.mvc.domain;

import com.isban.spring.mvc.service.*;

public abstract class Guerrero implements IGuerrero {
	
	protected IArma arma;
	protected String raza;

	public IArma getArma() {
		return arma;
	}

	public void setArma(IArma arma) {
		this.arma = arma;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

}
