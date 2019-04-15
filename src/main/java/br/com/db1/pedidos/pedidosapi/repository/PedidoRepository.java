package br.com.db1.pedidos.pedidosapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.db1.pedidos.pedidosapi.domain.entity.Pedido;
import br.com.db1.pedidos.pedidosapi.domain.entity.PedidoStatus;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {


	
	List<Pedido> findByStatus(PedidoStatus status);
	
}
