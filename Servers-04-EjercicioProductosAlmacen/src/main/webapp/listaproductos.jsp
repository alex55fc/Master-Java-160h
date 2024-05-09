<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista productos</title>
</head>
<body>
	<h2>Este es el listados de productos existente</h2>
</body>
<%@ page import="com.cursojava.service.ProductoService"%>
<%@ page import="com.cursojava.model.Producto"%>
<%@ page import="com.cursojava.controller.ServletAltaProducto"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<% 
	ProductoService service = new ProductoService();
	List<Producto> listaProducto= new ArrayList<>();
	listaProducto = service.getListaProductos();
	%>
	
	<% 
	if(listaProducto.isEmpty()){%>
		<p>El almacen esta vacio, ve a insertar un producto.</p>        
		<form action="altaproducto.html" method="post">
        <input type="submit" value="Ir a insertar">
    	</form> 
    	<% 
	}
	else{%>
		<table>
		<tr>
			<td>Nombre del producto</td>
			<td>Seccion</td>
			<td>Precio</td>
			<td>Stock</td>
		</tr>
		<%
		for(Producto prod : listaProducto){%>
		<tr>
			<td><%=prod.getNomProducto()%></td>
			<td><%=prod.getSeccion() %></td>
			<td><%=prod.getPrecio() %></td>
			<td><%=prod.getStock() %></td>
			<td>
	        <form action="ServletProductoActualizar" method="post">
	            <input type="hidden" name="nombre" value="<%=prod.getNomProducto() %>">
	            <input type="submit" value="Actualizar">
	        </form>
	    	</td>
	    	<td>
    	        <form action="ServletProductoEliminar" method="post">
            	<input type="hidden" name="nomProd" value="<%=prod.getNomProducto() %>">
            	<input type="submit" value="Eliminar">
        		</form>
        	</td>
		</tr>
		<%  }
		}
		%>
	</table>
      	<form action="altaproducto.html" method="post">
     	<input type="submit" value="Insertar otro producto">
 		</form>
</html>