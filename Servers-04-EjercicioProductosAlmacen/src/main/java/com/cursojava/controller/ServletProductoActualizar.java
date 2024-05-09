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
 * Servlet implementation class ServletProductoActualizar1
 */
public class ServletProductoActualizar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductoService service;
	RequestDispatcher rd;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		service = new ProductoService();
		HttpSession session= request.getSession(true);
		Producto prod = (Producto)session.getAttribute("prodEdit");
		String precio = request.getParameter("precio");
		String stock = request.getParameter("stock");
		int stockInt;
		double precioDouble;
		if(service.tryChangeStringToDouble(precio) && service.tryChangeStringToInt(stock)) {
			stockInt= (int)service.changeStringToInt(stock);
			precioDouble = service.changeStringToDouble(precio);
			
			prod.setNomProducto(request.getParameter("nomProd"));
			prod.setSeccion(request.getParameter("seccion"));
			prod.setPrecio(precioDouble);
			prod.setStock(stockInt);	
			rd = request.getRequestDispatcher("/listaproductos.jsp");
			rd.forward(request, response);
			out.println("Produtcto "+ prod.getNomProducto()+ " actualizado");
		}
		else {
			out.print("<em>Error en la entrada de datos</em>");
			rd = request.getRequestDispatcher("/editarproducto.jsp");
			rd.include(request, response);
		}
	}

}
