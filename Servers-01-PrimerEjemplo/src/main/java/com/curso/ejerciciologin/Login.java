package com.curso.ejerciciologin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("userName");
		String password = request.getParameter("userPass");
		

		if(password.equalsIgnoreCase("alex")) {
			User user = new User(nombre, password);
			HttpSession session= request.getSession(true);
			session.setAttribute("user", user);
			
			RequestDispatcher rd  = request.getRequestDispatcher("RegistrarCursos"); 
			rd.forward(request, response);
		
			
		}
		else {
			PrintWriter out = response.getWriter();
			out.print("Contrasenia incorrecta, introducela de nuevo");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
            rd.include(request, response);
		}

	}

}
