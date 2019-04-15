package br.com.db1.pedidos.pedidosapi.resurce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.db1.pedidos.pedidosapi.domain.dto.ProdutoDTO;
import br.com.db1.pedidos.pedidosapi.domain.entity.Produto;
import br.com.db1.pedidos.pedidosapi.domain.entity.ProdutoStatus;
import br.com.db1.pedidos.pedidosapi.service.ProdutoService;

@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService produtoService;
	
	
//	@GetMapping
//	public List<ProdutoDTO> getAll() {
//		return produtoService.getAll();
//	}


	@GetMapping(value = "/{codigo}")
	public void codigo(Produto codigo) {
		
	}
//	
//	
	@GetMapping
	public List<ProdutoDTO> getByStatus(@RequestParam("status") ProdutoStatus status){
		return produtoService.getByStatus(status);
		
	}

	@PostMapping
	public ProdutoDTO post(@RequestBody ProdutoDTO body) {
		
		return produtoService.salvar(body);
	}

	
 @PutMapping(value="/{id}")
 public ProdutoDTO  put(@PathVariable("id") Long id, @RequestBody ProdutoDTO body) {
		
		return produtoService.alterar(id,body);
	}

 @DeleteMapping(value="/{id}")
	public void delete(@PathVariable("id") Long id) {
	 produtoService.delete(id);
	}
}


