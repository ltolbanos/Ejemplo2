package com.isban.spring.mvc.service;

import java.util.List;

import com.isban.spring.mvc.domain.Usuario;

public interface IServicioUsuarios {

	public List<Usuario> getUsuarios();
	
	public Usuario getUsuario(String nick);
}
