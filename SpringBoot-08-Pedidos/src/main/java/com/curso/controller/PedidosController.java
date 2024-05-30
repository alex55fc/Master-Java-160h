package com.curso.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pedido;
import com.curso.service.PedidosServiceImpl;

@RestController
public class PedidosController {
	
	@Autowired
	PedidosServiceImpl service;
	
	@GetMapping(value="pedidos", produces= MediaType.APPLICATION_JSON_VALUE)
	List<Pedido> allOrders(){
		return service.allOrders();
	}
	
	@PostMapping(value="pedido/{idPedido}/{fechaPedido}/{direccionEnvio}/{nombreCliente}/{idProducto}")
	public List<Pedido> insertProductOrder(@PathVariable ("idPedido") int idPedido,
			@PathVariable("fechaPedido") Date fechaPedido,
			@PathVariable("direccionEnvio") String direccionEnvio,
			@PathVariable("nombreCliente") String nombreCliente,
			@PathVariable("idProducto") int idProducto) {
		Pedido pedido = new Pedido(idPedido,fechaPedido ,direccionEnvio,nombreCliente,idProducto );
		return service.insertProductOrder(pedido);
	}

}
