package com.curso.ejerciciocurso2.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ResultadosNotaMedia
 */
public class ResultadosNotaMedia extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		PrintWriter out = response.getWriter();
		String notaM = request.getParameter("notaMates");
		String notaL = request.getParameter("notaLengua");
		String notaI = request.getParameter("notaIngles");
		int notaMInt, notaLInt, notaIInt;
		int notaFinal;
		try{
			notaMInt = Integer.parseInt(notaM);
			notaLInt = Integer.parseInt(notaL);
			notaIInt = Integer.parseInt(notaI);

			if (notaMInt >= 0 && notaMInt <= 10 &&
					notaLInt >= 0 && notaLInt <= 10 &&
					notaIInt >= 0 && notaIInt <= 10) {
				notaFinal = (notaMInt + notaLInt +notaIInt) / 3;
				if(notaFinal > 5 ) {
					out.println("Estas aprobado");
				}
				else {
					out.println("Suspendiste :(");
				}
			}
			else {
				out.print("Recuerda que tu nota debe ser del 0 al 10(incluidos)<br>");
				rd = request.getRequestDispatcher("ServletNotaMediaFormulario");
				rd.include(request, response);
			}

		}
		catch(NumberFormatException e) {
			out.print("Formato incorrecto<br>");
			rd = request.getRequestDispatcher("ServletNotaMediaFormulario");
			rd.include(request, response);		
		}
	}

}
