package com.curso.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.InfoPersona;

@RestController
public class PruebasGetMappingController {
	
	//localhost:8080/value(se ejecutara lo que este en el valor de value de cada metodo )
	
	/*
	 * Este metodo se ejecutara cuando el Get con url localhost://8080/saludo
	 * Usamos el GetMapping porque queremos que se ejecute cuando se ejecute esa url
	 * http://localhost:8081/saludo
	 * Formato texto plano
	 * 
	 */
	@GetMapping(value="saludo", produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludar() {
		return "Hola desde Spring";
	}
	
	/*
	 * Este metodo tendra como variable a x e y que en este caso seran Strings
	 * http://localhost:8081/saludo/alex/fuela
	 * Formato texto plano
	 */
	@GetMapping(value="saludo/{x}/{y}", produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludoConParametros(@PathVariable("x") String nomA, @PathVariable("y")String nomB) {
		return "Hola desde Spring "+ nomA + " "+ nomB;
	}
	
	/*
	 * Este metodo lo hacemos con QueryString, pasando el parametro y el valor en la propia url 
	 * http://localhost:8081/saludo2?x=pepito&y=grillo
	 * Formato texto plano
	 */
	@GetMapping(value="saludo2", produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludar2(@RequestParam("x") String a, @RequestParam("y")String b) {
		return "Hola desde Spring "+ a + " "+ b;
	}
	
	/*
	 * Este metodo lo hacemos con QueryString, pasar el nombre y la edad de una persona
	 * http://localhost:8081/saludo2?x=pepito&y=grillo
	 * Formato texto plano
	 */
	@GetMapping(value="personaEdadNombre", produces=MediaType.TEXT_PLAIN_VALUE)
	public String personaEdadNombre(@RequestParam("nombre")String nom, @RequestParam("edad") int edad) {
		return "Hola "+ nom + " tienes "+ edad + " anios!";
	}
	
	/*
	 * Mostrar informacion de una persona de la clase InfoPersona
	 * Formato JSON
	 */
	@GetMapping(value="informacionCliente", produces=MediaType.APPLICATION_JSON_VALUE)
	public InfoPersona infoPersona() {
		return new InfoPersona("Jaime", 22,"jaime@gmail.com");
	}
}
