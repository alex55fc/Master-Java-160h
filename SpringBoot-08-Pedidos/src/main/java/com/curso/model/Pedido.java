package com.curso.model;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedido {
	@Id
	@Column(name="id_pedido")
	private int idPedido;
	@Column(name="fecha_pedido")
	private Date fechaPedido; 
	@Column(name="direccion_envio")
	private String direccionEnvio;
	@Column(name="nom_cliente")
	private String nombreCliente;
	@Column(name="id_producto")
	private int idProducto;
	
	public Pedido() {
		super();
	}
	
	
	public Pedido(int idPedido, Date fechaPedido, String direccionEnvio, String nombreCliente, int idProducto) {
		super();
		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.direccionEnvio = direccionEnvio;
		this.nombreCliente = nombreCliente;
		this.idProducto = idProducto;
	}


	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public String getDireccionEnvio() {
		return direccionEnvio;
	}
	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return idPedido == other.idPedido;
	}
	
}
