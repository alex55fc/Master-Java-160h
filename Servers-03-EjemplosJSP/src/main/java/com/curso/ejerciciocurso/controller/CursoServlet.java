package com.curso.ejerciciocurso.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.curso.ejerciciocurso.modelo.Curso;
import com.curso.ejerciciocurso.service.CursoService;

/**
 * Servlet implementation class CursoServlet
 */
public class CursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dificultad = request.getParameter("dificultad");
		String nombreCurso = request.getParameter("cursoNom");
		RequestDispatcher rd = null;
		try {
			int dificultadInt = Integer.parseInt(dificultad);
			CursoService service = new CursoService();
			Curso curso = service.crearCurso(nombreCurso, dificultadInt);
			service.aniadirCursoALista(curso);
			
			
			rd = request.getRequestDispatcher("mostrarcursos.jsp");
			rd.forward(request, response);
			
			
		}catch(NumberFormatException e) {
			PrintWriter out = response.getWriter();
			out.print("Introducce datos coherentes, intentalo de nuevo");
			rd = request.getRequestDispatcher("/formulariocrearcurso.html");
			rd.include(request, response);
		}
		
	}

}
