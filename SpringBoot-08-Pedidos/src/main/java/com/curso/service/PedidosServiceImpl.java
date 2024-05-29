package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.PedidosDao;
import com.curso.model.Pedido;

@Service
public class PedidosServiceImpl implements PedidosService {
	
	@Autowired
	PedidosDao dao;
	
	@Override
	public List<Pedido> allOrders() {
		return dao.findAll();
	}

}
