package br.com.db1.pedidos.pedidosapi.domain.dto;

import java.io.Serializable;

public class PedidoItemDTO implements Serializable {
	
	private String codigoProduto;
	private Double quantidade;
	
	public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	

}
