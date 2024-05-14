<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista por seccion</title>
</head>
<body>
<%@ page import="com.cursojava.service.ProductoService"%>
<%@ page import="com.cursojava.model.Producto"%>
<%@ page import="com.cursojava.controller.ServletAltaProducto"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
	<
	<% 
	ProductoService service = new ProductoService();
	List<Producto> listaProductoSeccion= new ArrayList<>();
	//obtenemos el parametro del servlet y llamamos al service para tener la lista de esta seccion
	String seccion= request.getParameter("seccionABuscar");
	listaProductoSeccion = service.devuelveListaPorSeccion(seccion);
	%>
	<h2>Lista por seccion</h2>
		<table border="1">
		<tr>
			<td>Nombre del producto</td>
			<td>Seccion</td>
			<td>Precio</td>
			<td>Stock</td>
		</tr>
		<%
		for(Producto prod : listaProductoSeccion){%>
		<tr>
			<td><%=prod.getNomProducto()%></td>
			<td><%=prod.getSeccion() %></td>
			<td><%=prod.getPrecio() %>$</td>
			<td><%=prod.getStock() %></td>
		</tr>
		<%  
		}
		%>
	</table>
	<form action="listaproductos.jsp" method="post">
     	<input type="submit" value="Volver">
 	</form>	
</body>
</html>