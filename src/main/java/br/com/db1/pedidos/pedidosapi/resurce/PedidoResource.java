package br.com.db1.pedidos.pedidosapi.resurce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.pedidos.pedidosapi.domain.dto.ClienteDTO;
import br.com.db1.pedidos.pedidosapi.domain.dto.PedidoDTO;
import br.com.db1.pedidos.pedidosapi.domain.dto.PedidoItemDTO;
import br.com.db1.pedidos.pedidosapi.domain.dto.ProdutoDTO;
import br.com.db1.pedidos.pedidosapi.domain.entity.PedidoStatus;
import br.com.db1.pedidos.pedidosapi.domain.entity.ProdutoStatus;
import br.com.db1.pedidos.pedidosapi.service.PedidoService;

@RestController
@RequestMapping(value = "/api/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService pedidoService;
	
//	@PostMapping
//	public PedidoDTO post(@RequestBody PedidoDTO body) {
//		System.out.println(body);
//		 return pedidoService.salvar(body);
//		
//	}
//	
	
	@GetMapping
	public List<PedidoDTO> getByStatus(@RequestParam("status") PedidoStatus status){
		return pedidoService.getByStatus(status);
		
	}
	
//	@PostMapping
//	public PedidoDTO post(@RequestBody PedidoDTO body) {
//		
//		return pedidoService.salvar(body);
//	}
	

}