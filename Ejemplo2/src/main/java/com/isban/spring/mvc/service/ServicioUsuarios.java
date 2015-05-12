package com.isban.spring.mvc.service;

import java.util.List;

import com.isban.spring.mvc.domain.Usuario;

public class ServicioUsuarios implements IServicioUsuarios {

	private List<Usuario> usuarios;

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public Usuario getUsuario(String nick){
		Usuario user = null;
		for(Usuario usuario: usuarios){
			if(usuario.getNick().equals(nick)){
				user = usuario;
				break;
			}
		}
		return user;
	}
}
