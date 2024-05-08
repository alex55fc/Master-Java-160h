package com.cursojava.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.cursojava.model.Producto;
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
		int stockInt;
		double precioDouble;
		service = new ProductoService();
		HttpSession session= request.getSession(true);
		PrintWriter out = response.getWriter();
		/*
		 * Comprueba si los string se pueden transformar a double e int respectivamente si no
		 * envia de vuelta al formulario. Si es que puede dentro del if se trasnforman
		 */
		if(service.tryChangeStringToDouble(precio) && service.tryChangeStringToInt(stock)) {
			stockInt= (int)service.changeStringToInt(stock);
			precioDouble = service.changeStringToDouble(precio);
			Producto prod = new Producto(nomProd, seccion, precioDouble,stockInt);
			session.setAttribute("producto", prod);

			if(service.insertProductoEnAlmacen(prod)) {
				rd = request.getRequestDispatcher("/listaproductos.jsp");
				rd.include(request, response);
			}
			else {
				out.println("Error al insertar un producto"+ "<br><a href=\"altaproducto.html \">volver</a>");
			}

		}
		else {
			out.print("<em>Error en la entrada de datos</em>");
			rd = request.getRequestDispatcher("/altaproducto.html");
			rd.include(request, response);
		}
	}

}
