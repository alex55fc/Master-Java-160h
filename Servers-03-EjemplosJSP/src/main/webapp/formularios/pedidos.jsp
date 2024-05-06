<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recuperar datos del HTML</title>
</head>
<body>
	<%
	String codigo= request.getParameter("codigo");
	String unidades= request.getParameter("unidades");
	%>
	<h3>Has comprado <%=unidades%> unidades del producto con codigo <%=codigo%></h3>
</body>
</html>