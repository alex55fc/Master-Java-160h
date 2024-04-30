package com.curso.ejemplo01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletFormulario02
 */
public class ServletFormulario02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		if(request.getParameter("pilates") != null && request.getParameter("yoga") != null) {
			out.println("Seleccionaste la opcion de pilates y la de yoga");
		}
		else if(request.getParameter("yoga") != null) {
			out.println("Seleccionaste la opcion de yoga<br>");
		}
		else if(request.getParameter("pilates") != null) {
			out.println("Seleccionaste la opcion de pilates<br>");
		}

		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
