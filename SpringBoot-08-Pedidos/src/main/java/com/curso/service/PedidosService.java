package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;

public interface PedidosService {
	
	/*
	 * Metodos CRUD
	 */
	List<Pedido> allOrders();
	
	/*
	 * Metodo para el enlace de microservicicos
	 * Inserta un pedido y resta el stock del producto en su microservicio
	 * Devolvera una lista con los pedidos que hay
	 */
	List<Pedido> insertProductOrder(Pedido pedido);
}
