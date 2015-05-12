package com.isban.spring.mvc.domain;

public class Dominio {

	private Dominio(){
	}
	
	private static class DominioSingletonHolder{
		static Dominio instance = new Dominio();
	}
	
	public static Dominio getInstance(){
		return DominioSingletonHolder.instance;
	}
	
}
