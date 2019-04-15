package br.com.db1.pedidos.pedidosapi.domain.dto;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;

import br.com.db1.pedidos.pedidosapi.domain.entity.ProdutoStatus;

public class ProdutoDTO implements Serializable {
	
	//public static final long serialVersionUDI = 23L;


	private Long id;
	private String none;
	private Double valor;
	private String codigo;
	private ProdutoStatus status;

	

	
	
	
	public ProdutoDTO() {
		
	}





	public ProdutoDTO(Long id, String none, Double valor, String codigo, ProdutoStatus status) {
		super();
		this.id = id;
		this.none = none;
		this.valor = valor;
		this.codigo = codigo;
		this.status = status;
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getNone() {
		return none;
	}





	public void setNone(String none) {
		this.none = none;
	}





	public Double getValor() {
		return valor;
	}





	public void setValor(Double valor) {
		this.valor = valor;
	}





	public String getCodigo() {
		return codigo;
	}





	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}





	public ProdutoStatus getStatus() {
		return status;
	}





	public void setStatus(ProdutoStatus status) {
		this.status = status;
	}





	@Override
	public int hashCode() {
		return Objects.hash(codigo, id, none, status, valor);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ProdutoDTO)) {
			return false;
		}
		ProdutoDTO other = (ProdutoDTO) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(id, other.id) && Objects.equals(none, other.none)
				&& status == other.status && Objects.equals(valor, other.valor);
	}




	
	
	

}
