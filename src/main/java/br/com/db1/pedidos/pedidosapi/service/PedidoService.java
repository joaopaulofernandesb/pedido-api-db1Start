package br.com.db1.pedidos.pedidosapi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.pedidos.pedidosapi.domain.dto.ClienteDTO;
import br.com.db1.pedidos.pedidosapi.domain.dto.PedidoDTO;
import br.com.db1.pedidos.pedidosapi.domain.dto.PedidoItemDTO;
import br.com.db1.pedidos.pedidosapi.domain.dto.ProdutoDTO;
import br.com.db1.pedidos.pedidosapi.domain.entity.Cliente;
import br.com.db1.pedidos.pedidosapi.domain.entity.Pedido;
import br.com.db1.pedidos.pedidosapi.domain.entity.PedidoStatus;
import br.com.db1.pedidos.pedidosapi.domain.entity.Produto;
import br.com.db1.pedidos.pedidosapi.domain.entity.ProdutoStatus;
import br.com.db1.pedidos.pedidosapi.repository.ClienteRepository;
import br.com.db1.pedidos.pedidosapi.repository.PedidoRepository;
import br.com.db1.pedidos.pedidosapi.repository.ProdutoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;

//	public PedidoDTO salvar(PedidoDTO dto) {
//		String codigoProduto = String.valueOf(System.currentTimeMillis());
//		Cliente cliente = clienteRepository.getOne(dto.getIdCliente());
//		
//		Pedido pedido = new Pedido(codigoProduto, cliente);
//		
//		for (PedidoItemDTO itemDTO : dto.getItens()) {
//			Produto produto = produtoRepository.findByCodigo(itemDTO.getCodigoProduto());
//			pedido.adicionarItem(produto, itemDTO.getQuantidade());			
//		}
//		
//		pedidoRepository.save(pedido);
//		
//		return dto;
//	}

	
	public List<PedidoDTO> getAllActive() {
		Iterable<Pedido> pedidoDatabase = pedidoRepository.findByStatus(PedidoStatus.ABERTO);
		return this.getByStatus(PedidoStatus.ABERTO);
	}
	public List<PedidoDTO> getByStatus(PedidoStatus status) {
		return pedidoRepository
				.findByStatus(status)
				.stream()
				.map(pedido -> this.pedidoToDto(pedido))
				.collect(Collectors.toList());
		
	}


	private PedidoDTO pedidoToDto(Pedido pedido) {
		
		return new PedidoDTO(pedido.getId(), pedido.getCodigo(), pedido.getDataStatus(), pedido.getStatus(), pedido.getCliente());
	}
	

	

}
