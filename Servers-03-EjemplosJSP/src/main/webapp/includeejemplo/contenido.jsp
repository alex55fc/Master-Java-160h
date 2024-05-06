<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejemplo uso include</title>
</head>
<body>
	<%@ include file="cabecera.jsp"%>
	<h1>Este es el titulo de la pagina</h1>
	<p>Este es el contenido de la pagina</p>
	<%@ include file="pie.jsp"%>

</body>
</html>