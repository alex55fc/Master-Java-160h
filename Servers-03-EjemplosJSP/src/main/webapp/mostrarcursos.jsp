<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar cursos</title>
</head>
<body>
	<%@ page import="jakarta.servlet.ServletException" %>
	<%@ page import="jakarta.servlet.http.HttpServlet" %>
	<%@ page import="jakarta.servlet.http.HttpServletRequest" %>
	<%@ page import="jakarta.servlet.http.HttpServletResponse" %>
	<%@ page import="jakarta.servlet.http.HttpSession" %>
	<%@ page import="com.curso.ejerciciocurso.modelo.Curso" %>
	<%
	
	HttpSession ses= request.getSession();
	Curso curso= (Curso)ses.getAttribute("curso");  %>

	<h2>Cursos a los que estas apuntado</h2>
	<ul>
		<%  %>
		<li></li>
	</ul>
</body>
</html>