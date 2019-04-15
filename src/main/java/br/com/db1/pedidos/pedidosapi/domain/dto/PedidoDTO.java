package br.com.db1.pedidos.pedidosapi.domain.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import br.com.db1.pedidos.pedidosapi.domain.entity.Cliente;
import br.com.db1.pedidos.pedidosapi.domain.entity.PedidoStatus;

public class PedidoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String codigo;
	private  LocalDateTime dataStatus;
	private PedidoStatus status;
	private Cliente cliente;
	

	
	

	public PedidoDTO() {
		
	}




	public PedidoDTO(Long id, String codigo, LocalDateTime dataStatus, PedidoStatus status, Cliente cliente) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.dataStatus = dataStatus;
		this.status = status;
		this.cliente = cliente;

	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getCodigo() {
		return codigo;
	}




	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}




	public LocalDateTime getDataStatus() {
		return dataStatus;
	}




	public void setDataStatus(LocalDateTime dataStatus) {
		this.dataStatus = dataStatus;
	}




	public PedidoStatus getStatus() {
		return status;
	}




	public void setStatus(PedidoStatus status) {
		this.status = status;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}






	
	 

}