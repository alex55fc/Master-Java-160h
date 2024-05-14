<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edita tu producto</title>
</head>
<body>
<%@ page import="com.cursojava.service.ProductoService"%>
<%@ page import="com.cursojava.model.Producto"%>
<%@ page import="com.cursojava.controller.ServletAltaProducto"%>
<%@ page import="jakarta.servlet.http.HttpSession"%>
	
<%
HttpSession session1 = request.getSession();
Producto prod = (Producto)session1.getAttribute("prodEdit");
%>
	<h2>Estas editando el producto: <%=prod.getNomProducto() %></h2>
	
	<form action="ServletProductoActualizar" method="post">
	Nombre del producto: <input type="text" name="nomProd" value="<%=prod.getNomProducto() %>"><br>
	Seccion: <input type="text" name="seccion" value="<%=prod.getSeccion() %>"><br>
	Precio: <input type="number" name="precio" value="<%=prod.getPrecio() %>"><br>	
	Stock: <input type="number" name="stock" value="<%=prod.getStock() %>"><br>	
	<input type="submit" value="Editar producto">
	</form>
	
   	<form action="listaproductos.jsp" method="post">
  	<input type="submit" value="Volver al listado">
	</form>
</body>
</html>