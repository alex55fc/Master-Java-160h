package com.curso.ejerciciologin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegistrarCursos
 */
public class RegistrarCursos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang = \"es\">");
		out.println("<head>");
		out.println("<meta charset =\"UTF-8\">");
		out.println("<title>Registramos cursos</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(user.getNombre()+ " escribe el curso al que quieras inscribirte.");
		out.println("<form action=\"ListaCursos\" method=\"post\">");
		out.println("Nombre del curso:<input type=\"text\" name=\"cursoName\"><br>");
		out.println("<input type=\"submit\" value=\"login curso\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
