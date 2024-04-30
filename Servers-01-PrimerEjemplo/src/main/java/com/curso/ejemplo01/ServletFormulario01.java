package com.curso.ejemplo01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletFormulario01
 */
public class ServletFormulario01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String numStringARepetirBucle = request.getParameter("numBucle");
		int numARepetirBucle = Integer.parseInt(numStringARepetirBucle);

		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang = \"es\">");
		out.println("<head>");
		out.println("<meta charset =\"UTF-8\">");
		out.println("<title>Titulo arriba</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Se repite "+ nombre + " "+ apellido + " "+ numARepetirBucle+ " veces en un bucle<br>");
		for (int i=0; i<numARepetirBucle ; i++) {
			out.println(nombre + " "+ apellido+ "<br>");
		} 
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
