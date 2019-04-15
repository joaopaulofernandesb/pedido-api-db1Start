package br.com.db1.pedidos.pedidosapi.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.pedidos.pedidosapi.domain.dto.ProdutoDTO;
import br.com.db1.pedidos.pedidosapi.domain.entity.Cliente;
import br.com.db1.pedidos.pedidosapi.domain.entity.Produto;
import br.com.db1.pedidos.pedidosapi.domain.entity.ProdutoStatus;
import br.com.db1.pedidos.pedidosapi.repository.ProdutoRepository;


@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	


	
	
	public List<ProdutoDTO> getAllActive() {
		Iterable<Produto> produtoDatabase = produtoRepository.findByStatus(ProdutoStatus.ATIVO);
		return this.getByStatus(ProdutoStatus.ATIVO);
	}
	
	public List<ProdutoDTO> getByStatus(ProdutoStatus status) {
		return produtoRepository
				.findByStatus(status)
				.stream()
				.map(produto -> this.produtoToDto(produto))
				.collect(Collectors.toList());
	}

	
	public ProdutoDTO salvar(ProdutoDTO dto) {
		
		Produto produto = new Produto(dto.getCodigo(), dto.getNone(), dto.getValor());
		Produto produtoSalvo = produtoRepository.save(produto);
		return this.produtoToDto(produtoSalvo);
		
	}
	
	
	private ProdutoDTO produtoToDto(Produto produto) {
		
		return new ProdutoDTO(produto.getId(), produto.getNome(), produto.getValor(), produto.getCodigo(), produto.getStatus());
	}
	

	
	public ProdutoDTO alterar(Long id, ProdutoDTO body) {
		Produto produtoDatabase = produtoRepository.getOne(id);
		produtoDatabase.setCodigo(body.getCodigo());
		produtoDatabase.setNome(body.getNone());
		produtoDatabase.setValor(body.getValor());
		produtoRepository.save(produtoDatabase);
		return this.produtoToDto(produtoDatabase);
		
	}

	

	public void delete(Long id) {
		Produto clienteDatabase = produtoRepository.getOne(id);
		clienteDatabase.marcarComoExcluido();
		produtoRepository.save(clienteDatabase);
	}




}
 