package com.curso.ejerciciocurso2.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.curso.ejerciciocurso2.model.Persona;

/**
 * Servlet implementation class ServletPersona
 */
public class ServletPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		PrintWriter out = response.getWriter();
		Persona persona = null;
		String user = request.getParameter("user");
		String paswd = request.getParameter("pswd");
		String age = request.getParameter("age");
		int ageInt;
		
		try {
			ageInt = Integer.parseInt(age);
			if(paswd.equalsIgnoreCase("password") && paswd != null) {
				persona = new Persona(user,paswd,ageInt);
				HttpSession session= request.getSession();
				session.setAttribute("user", persona);
				
				rd = request.getRequestDispatcher("ServletNotaMediaFormulario");
				rd.forward(request, response);
			}
			else {
				out.print("Datos introcudidos incorrectos");
				rd = request.getRequestDispatcher("/formulariopersona.html");
	            rd.include(request, response);
			}
		}
		catch(NumberFormatException e){
			out.print("Formato de la edad incorrecto");
			rd = request.getRequestDispatcher("/formulariopersona.html");
            rd.include(request, response);
		}
	}
}
