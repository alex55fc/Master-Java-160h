package com.cursojava.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.cursojava.model.Producto;
import com.cursojava.service.ProductoService;

/**
 * Servlet implementation class ServletProductoEliminar
 */
public class ServletProductoEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductoService service;
	RequestDispatcher rd;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		String nomProd = request.getParameter("nomProd");
		service = new ProductoService();
		
		//hacemos que nos devuelva un producto con el nombre seleccionado
		Producto prod = service.devolverProductoPorNombre(nomProd);
		//si existe el producto lo eliminamos
		if(prod != null) {
			if(service.deleteProductoEnAlmacen(prod)) {
				out.println("Producto borrado con exito del almacen");
				rd = request.getRequestDispatcher("/listaproductos.jsp");
				rd.forward(request, response);
			}
			else {
				out.println("Error al borrar el producto del almacen");
				rd = request.getRequestDispatcher("/listaproductos.jsp");
				rd.include(request, response);
			}
		}
	}

}
