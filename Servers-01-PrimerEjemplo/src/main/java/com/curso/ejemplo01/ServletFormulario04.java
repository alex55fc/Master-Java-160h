package com.curso.ejemplo01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletFormulario04
 */
public class ServletFormulario04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] rutinaCalistenia= new String[0];
		rutinaCalistenia= request.getParameterValues("calisteniaATrabajar");
        String cursoYoga = request.getParameter("cursoYoga");
        String hitCurso = request.getParameter("hitCursos");
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
		out.println("<h2>La rutina de hoy sera la siguiente:</h2><br>");
		if(cursoYoga!= null) {
			out.println("Tienes curso de yoga");
		}
		else {
			out.println("Hoy no tienes curso de yoga");
		}
		out.println("<br>");
		out.println("Tienes hit "+ hitCurso);
		out.println("<br>");
		out.println("Y por ultimo de calistenia hoy te toca: ");
		for(String rutina : rutinaCalistenia) {
			out.println(rutina);
		}

		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
