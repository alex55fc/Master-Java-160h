package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Persona;

@Service
public class PersonaService {
	
	static List<Persona> listaPersonas = new ArrayList<>();
	
	static {
		Persona p1 = new Persona("pepito", "grillo", 123);
		Persona p2 = new Persona("ana", "rivas", 25);
		listaPersonas.add(p1);
		listaPersonas.add(p2);
	}
	
	public List<Persona> buscarTodos(){
		return listaPersonas;
	}
}

