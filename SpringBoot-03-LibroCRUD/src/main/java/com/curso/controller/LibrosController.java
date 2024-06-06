package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Libro;
import com.curso.service.LibrosService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class LibrosController {
	@Autowired
	LibrosService service;
	

	@GetMapping(value="libros", produces=MediaType.APPLICATION_JSON_VALUE)
	 public List<Libro> libros(){
		 return service.libros();
	 }
	@GetMapping(value="libros/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
	 Libro buscarLibro(@PathVariable int isbn) {
		 return service.buscarLibro(isbn);
	 }
	
	//para el swagger
    @Operation(
            summary="Crea un nuevo Libro.",
            description="Crea un nuevo Libro a partir de los datos recibidos"
            )

	@ApiResponses({
	    @ApiResponse(responseCode ="200", description ="OK", content = 
	    {@Content(mediaType ="application/JSON", schema=
	    @Schema(implementation=Libro.class))
	    }),
	    @ApiResponse(responseCode ="401", description="invalido lo que sea"),
	})
	
	@PostMapping(value="libros", consumes=MediaType.APPLICATION_JSON_VALUE)
	 void altaLibro(@RequestBody Libro libro) {
		 service.altaLibro(libro);
	 }
	@PutMapping(value="libros", consumes=MediaType.APPLICATION_JSON_VALUE)
	 void actualizarLibro(@RequestBody Libro libro) {
		 service.actualizarLibro(libro);
	 }
	@DeleteMapping(value="libros/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
	 List<Libro> eliminarLibro(@PathVariable int isbn){
		 return service.eliminarLibro(isbn);
	 }

}
