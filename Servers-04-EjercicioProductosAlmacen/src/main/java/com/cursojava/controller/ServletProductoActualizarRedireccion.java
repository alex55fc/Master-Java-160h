package com.cursojava.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.cursojava.model.Producto;
import com.cursojava.service.ProductoService;

/**
 * Servlet implementation class ServletProductoActualizar
 */
public class ServletProductoActualizarRedireccion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductoService service;
	RequestDispatcher rd;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		String nomProd = request.getParameter("nomProdEdit");
		service = new ProductoService();
		Producto prod = service.devolverProductoPorNombre(nomProd);
		
		if(prod != null) {
			HttpSession session = request.getSession();
			session.setAttribute("prodEdit", prod);

			rd = request.getRequestDispatcher("/editarproducto.jsp");
			rd.forward(request, response);
		}
		else {
			out.println("Error al editar el producto del almacen");
			rd = request.getRequestDispatcher("/listaproductos.jsp");
			rd.include(request, response);
		}
	}

}
