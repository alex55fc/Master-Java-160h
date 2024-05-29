package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.ProductosDao;
import com.curso.model.Producto;

@Service
public class ProductosServiceImpl implements ProductosService {
	@Autowired
	ProductosDao dao;
	
	@Override
	public List<Producto> allProducts() {
		return dao.findAll();
	}

	@Override
	public void updateProductStock(Integer idProd, Integer stock) {
		dao.updateProductStock(idProd, stock);
	}

	@Override
	public Double obtainProductPrice(int idProd) {
		Double precioProducto = dao.obtainProductPrice(idProd);
		return precioProducto;
	}

}
