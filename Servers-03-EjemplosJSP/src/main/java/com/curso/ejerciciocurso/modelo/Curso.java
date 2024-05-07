package com.curso.ejerciciocurso.modelo;

public class Curso {
	private String nombreCurso;
	private int dificultad;
	
	public Curso(String nombreCurso, int dificultad) {
		super();
		this.nombreCurso = nombreCurso;
		this.dificultad = dificultad;
	}

	@Override
	public String toString() {
		return "Curso=" + nombreCurso + ", dificultad=" + dificultad;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	
}
