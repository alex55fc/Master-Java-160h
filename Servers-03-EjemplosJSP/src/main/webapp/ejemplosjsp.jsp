<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Esto es JSP</title>
</head>
<body>
	<h3>Primer ejemplo de JSP</h3>
	<%
	//esto es un script
	String saludo= "Hola desde el mundo JSP, esto esta escrito en un script ";
	out.println(saludo);	
	%>
	
	<h3>Segundo ejemplo</h3>
	<% String saludo2 = "Hola de nuevo desde jsp"; %>
	<%=saludo2 %>
	
	<h3>Esto es una tabla de multiplicar con JSP</h3>
	<%
    for (int i = 1; i <= 10; i++) {
        for (int j = 1; j <= 10; j++) {
            out.print( (i * j));
			if(j < 10){
				out.println(", ");
			}
        }
        out.print("<br>");
    }
	%>

</body>
</html>