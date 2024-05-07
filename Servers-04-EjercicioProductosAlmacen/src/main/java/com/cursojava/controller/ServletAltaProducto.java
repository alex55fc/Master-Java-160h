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
 * Servlet implementation class ServletAltaProducto
 */
public class ServletAltaProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductoService service;
	RequestDispatcher rd;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomProd = request.getParameter("nomProd");
		String seccion = request.getParameter("seccion");
		String precio = request.getParameter("precio");
		String stock = request.getParameter("stock");
		service = new ProductoService();
		
		if(service.tryChangeStringToInt(precio) && service.tryChangeStringToInt(stock)) {
			
		}
		else {
			PrintWriter out = response.getWriter();
			out.print("<em>Error en la entrada de datos</em>");
			rd = request.getRequestDispatcher("/altaproducto.html");
            rd.include(request, response);
		}
	}

}
