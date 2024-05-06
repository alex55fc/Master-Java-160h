package com.masterjava.busquedapaginas;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletRedireccion
 */
public class ServletRedireccion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paginaRedireccionada = request.getParameter("tematica");
		RequestDispatcher rd;
		if(paginaRedireccionada.equalsIgnoreCase("musica")) {
			rd = request.getRequestDispatcher("/musica.html");
			rd.forward(request, response);
		}
		else if(paginaRedireccionada.equalsIgnoreCase("juegos") ) {
			rd = request.getRequestDispatcher("/juegos.html");
			rd.forward(request, response);
		}
		else if (paginaRedireccionada.equalsIgnoreCase("libros")) {
			rd = request.getRequestDispatcher("/libros.html");
			rd.forward(request, response);
		}
		else {
			rd = request.getRequestDispatcher("/pagenotfound.html");
			rd.forward(request, response);
		}
		
	}

}
