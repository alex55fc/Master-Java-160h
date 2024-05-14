package com.cursojava.model;

import java.util.Objects;

public class Producto {
	private String nomProducto;
	private String seccion;
	private double precio;
	private int stock;
	
	public Producto(String nomProducto, String seccion, double precio, int stock) {
		super();
		this.nomProducto = nomProducto;
		this.seccion = seccion;
		this.precio = precio;
		this.stock = stock;
		
	}
	
	@Override
	public String toString() {
		return "Producto: " + nomProducto + ", seccion=" + seccion + ", precio=" + precio + ", stock="
				+ stock + "";
	}

	public String getNomProducto() {
		return nomProducto;
	}
	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nomProducto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nomProducto, other.nomProducto);
	}
	
	
}
