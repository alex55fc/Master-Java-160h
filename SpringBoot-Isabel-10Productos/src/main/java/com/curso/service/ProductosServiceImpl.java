package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.ProductosDao;
import com.curso.model.Producto;
@Service
public class ProductosServiceImpl implements ProductosService {
	@Autowired
	ProductosDao productosDao;

	@Override
	public List<Producto> productos() {
		return productosDao.findAll();
	}

	@Override
	public void actualizarStock(int codigoProducto, int unidades) {
		Producto producto=productosDao.findById(codigoProducto).orElse(null);
		if(producto!=null&&producto.getStock()>unidades) {
			producto.setStock(producto.getStock()-unidades);
			productosDao.save(producto);
		}

	}
	@Override
	public double precioProducto(int codigoProducto) {
		Producto producto=productosDao.findById(codigoProducto).orElse(null);
		/* En este return comprobamos si el objeto es null,
		 * si no es null se llama al metodo getPrecioUnitario() para obtener el precio unitario
		 * si es null se devuleve 0
		 */
		return producto!=null?producto.getPrecioUnitario():0;
	}



}
