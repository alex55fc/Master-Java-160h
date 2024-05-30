package com.curso.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.PedidosDao;
import com.curso.model.Pedido;

@Service
public class PedidosServiceImpl implements PedidosService {
	
	@Autowired
	PedidosDao dao;
	
	//Para la conectividad con el otro microsrvicio
	@Autowired
	RestTemplate template;
	
	private String url="http://localhost:8000/";
	
	@Override
	public List<Pedido> allOrders() {
		return dao.findAll();
	}

	@Override
	public List<Pedido> insertProductOrder(Pedido pedido) {
		//usamos postForLocation porque no devuleve resultados
		template.postForLocation(url + "productos", pedido);
		
		//getForObject nos devuleve un array de ejemplares
		return Arrays.asList(template.getForObject(url +"productos", Pedido[].class));
	}

}
