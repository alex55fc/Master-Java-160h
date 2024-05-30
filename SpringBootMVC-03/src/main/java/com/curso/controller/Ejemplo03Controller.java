package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.service.PersonaService;

@Controller
@RequestMapping("/personas")
public class Ejemplo03Controller {
	
	@Autowired
	PersonaService service;
	
	@GetMapping("/lista")
	public String mostrarPersonas() {
		return "personas/lista";
	}
	
	@GetMapping("/lista2")
	public String mostrarPersona2(Model model) {
		model.addAttribute("listaPersonas", service.buscarTodos());
		return "personas/lista2";
	}
}
