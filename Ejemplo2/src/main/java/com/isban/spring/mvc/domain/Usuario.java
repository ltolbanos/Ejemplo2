package com.isban.spring.mvc.domain;

import java.util.Date;
import java.util.List;

import com.isban.spring.mvc.service.IGuerrero;

public class Usuario {

	private String nick;
	private String password;
	private String nombre;
	private String apellidos;
	private String mail;
	private Date fechaNacimiento;
	private List<IGuerrero> personajes;
	
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public List<IGuerrero> getPersonajes() {
		return personajes;
	}
	public void setPersonajes(List<IGuerrero> personajes) {
		this.personajes = personajes;
	}
	
}
