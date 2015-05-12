package com.isban.spring.mvc.domain;

import java.util.List;
import com.isban.spring.mvc.service.*;


public class GuerreroEspecial implements IGuerrero {
	
	private List<IArma> armas;
	
	public void setArmas(List<IArma> armas){
		this.armas = armas;
	}
	
	public List<IArma> getArmas(){
		return armas;
	}

	public void hablar() {
		System.out.println("\"Yo no rindo cuentas a nadie porque soy un guerrero especial\"");
	}

	public void atacar() {
		
		System.out.println("El guerrero especial ataca: ");
		for (IArma arma: armas){
			arma.empuñar();
		}
	}

}
