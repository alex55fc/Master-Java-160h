package com.curso.ejerciciocurso2.model;

public class Persona {
	private String user;
	private String password;
	private int age;
	public Persona(String user, String password, int age) {
		super();
		this.user = user;
		this.password = password;
		this.age = age;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
