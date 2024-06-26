<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cursos</title>
</head>
<body>
	<%
	String curso1= "chino";
	String curso2= "japones";
	String curso3= "esperanto";
	
	List<String> listaCursos= new ArrayList<>();
	listaCursos.add(curso1);
	listaCursos.add(curso2);
	listaCursos.add(curso3);
	%>
	
	<h2>Cursos usando parrafos</h2>
	<%
	for(String curso : listaCursos){
		%>
		<p><%=curso%></p>
	<% 
	}
	%>
	
	<h2>Cursos usando una tabla de una fila</h2>
	
	<table border="1">
    <tr>
    	<%
	for(String curso : listaCursos){
		%>
		<td><%=curso%></td>
	<% 
	}
	%>
     </tr>
     </table>
     
	<h2>Cursos usando una tabla de una columna</h2>
	<table border="1">
		<% for(String curso : listaCursos){ %>
		<tr>
			<td><%=curso %></td>
		</tr>
	<% } %>
	</table>
	
	<h2>Cursos usando una lista</h2>
	<%
	for(String curso : listaCursos){
		out.println(curso);
	}
	%>
</body>
</html>