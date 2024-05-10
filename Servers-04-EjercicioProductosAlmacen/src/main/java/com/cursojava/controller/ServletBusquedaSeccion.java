package com.cursojava.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.cursojava.service.ProductoService;

/**
 * Servlet implementation class ServletBusquedaSeccion
 */
public class ServletBusquedaSeccion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductoService service;
	RequestDispatcher rd;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String seccion = request.getParameter("seccionABuscar");
		service = new ProductoService();
		PrintWriter out = response.getWriter();
		
		//Comprobamos si existe la seccion, si existe mandamos a una pagina jsp para mostrar la lista de esa seccion
		if(service.existeSeccionEnAlmacen(seccion)) {
			rd = request.getRequestDispatcher("/listaproductosporseccion.jsp");
			rd.include(request, response);
		}
		else {
			out.print("<em>Error no existe esa seccion en el almacen</em>");
			rd = request.getRequestDispatcher("/listaproductos.jsp");
			rd.include(request, response);
		}
		
	}

}
