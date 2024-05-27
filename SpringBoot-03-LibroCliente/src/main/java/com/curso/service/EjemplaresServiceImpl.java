package com.curso.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Ejemplar;

@Service
public class EjemplaresServiceImpl implements EjemplaresService {
	
	@Autowired
	RestTemplate template;
	
	private String url= "http://localhost:8080/";
	
	/*
	 * A este metodo le llega el ejemplar creado en el EjemplaresController
	 * Y con ese ejemplar llamamos al metodo del controlador del otro servicio
	 */
	@Override
	public List<Ejemplar> insertarNuevoEjemplar(Ejemplar ejemplar) {
		//usamos postForLocation porque no devuleve resultados
		template.postForLocation(url + "libros", ejemplar);  /* http://localhost:8080/libros */
		
		//getForObject nos devuleve un array de ejemplares
		return Arrays.asList(template.getForObject(url + "libros", Ejemplar[].class)) ;  /* http://localhost:8080/libros */
	}

}
