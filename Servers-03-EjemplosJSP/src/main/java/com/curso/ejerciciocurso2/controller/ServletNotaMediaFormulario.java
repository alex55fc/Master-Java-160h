package com.curso.ejerciciocurso2.controller;

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
 * Servlet implementation class ServletNotaMediaFormulario
 */
public class ServletNotaMediaFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Persona user = (Persona)session.getAttribute("user");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>"
			+"<html lang = \"es\">"
			+"<head>"
			+"<meta charset =\"UTF-8\">"
			+"<title>Formulario notas</title>"
			+"</head>"
			+"<body>"
			+user.getUser()+ " tienes "+ user.getAge()+ " anios<br>"
			+"Escribe tus notas finales para comprobar si estas aprobado:"
			+"<form action=\"ResultadosNotaMedia\" method=\"post\">"
			+"Nota matematicas:<input type=\"text\" name=\"notaMates\"><br>"
			+"Nota lengua:<input type=\"text\" name=\"notaLengua\"><br>"
			+"Nota ingles:<input type=\"text\" name=\"notaIngles\"><br>"
			+"<input type=\"submit\" value=\"Comprobar resultado\">"
			+"</form>"
			+"</body>"
			+"</html>");
		out.close();
	}

}
