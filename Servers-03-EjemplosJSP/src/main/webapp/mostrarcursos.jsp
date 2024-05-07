<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar cursos</title>
</head>
<body>
	<%@ page import="com.curso.ejerciciocurso.modelo.Curso"%>
	<%@ page import="com.curso.ejerciciocurso.service.CursoService"%>
	<%@ page import="java.util.List"%>
	<%@ page import="java.util.ArrayList"%>
	<%
	
	  
	CursoService service = new CursoService();
	List<Curso> listaCursos = new ArrayList<>();
	listaCursos = service.devolverListaCursos();
	%>

	<h2>Cursos a los que estas apuntado</h2>
	<%
	if(listaCursos.isEmpty()){
		out.println("No hay ningun curso en la lista");	
	}
	else{
		for(Curso curso1 : listaCursos){
			out.println(curso1.toString());%><br><%
		}			
	}

	%>
</body>
</html>