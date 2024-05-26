package com.grado.service;

import java.util.List;

import com.grado.model.Grado;

public interface GradosService {
	
    List<Grado> altaGrado(int grado);
    List<Grado> eliminarGrado(int codGrado);
    void actualizarDuracion(int codGrado, int duracion);
    Grado buscarGrado(int codGrado);
    List<Grado> gradosPorPrecio(double precioMin, double precioMax);
    //List<Grado> obtenerGrados();
}
