package com.curso.ejerciciologin;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String nombre;
	private String password;
	private List<String> listaCursos;
	
	public User(String nombre, String password) {
		super();
		this.nombre = nombre;
		this.password = password;
		listaCursos = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<String> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(List<String> listaCursos) {
		this.listaCursos = listaCursos;
	}

	public boolean addCursoToList(String curso) {
		if(curso.trim().equals("")) {
			return false;
		}
		else {
			listaCursos.add(curso);
			return true;
		}
	}
	
}
