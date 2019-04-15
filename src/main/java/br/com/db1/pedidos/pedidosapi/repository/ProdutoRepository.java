package br.com.db1.pedidos.pedidosapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.db1.pedidos.pedidosapi.domain.dto.ProdutoDTO;
import br.com.db1.pedidos.pedidosapi.domain.entity.Produto;
import br.com.db1.pedidos.pedidosapi.domain.entity.ProdutoStatus;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto,Long> {
	
Produto findByCodigo(String codigo);
	
	List<Produto> findByStatus(ProdutoStatus status);
	
	
	



	//Iterable<Produto> findByStatus(ProdutoStatus status);




		
	
	

	
}
