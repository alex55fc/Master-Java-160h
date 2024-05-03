package com.curso.ejerciciologin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class ListaCursos
 */
public class ListaCursos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		String curso = request.getParameter("cursoName");
		List<String> listaCursos = user.getListaCursos();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang = \"es\">");
		out.println("<head>");
		out.println("<meta charset =\"UTF-8\">");
		out.println("<title>Titulo arriba</title>");
		out.println("</head>");
		out.println("<body>");
		if(user.addCursoToList(curso)) {
			out.println("<em>Se inserto un curso correctamente</em>");
		}
		else {
			out.println("<em>No se inserto un curso en el formulario</em>");
		}
		out.println("<br>");
		if(listaCursos.isEmpty()) {
			out.println("No hay ningun curso registrado para el usuario "+ user.getNombre());
		}
		else {
			out.println("<h2>Lista de cursos</h2>");
			out.println("<ul>");
			for(String curso1 : listaCursos ) {
				out.println("<li>"+ curso1 + "</li>");
			}
			out.println("</ul>");

		}


		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
