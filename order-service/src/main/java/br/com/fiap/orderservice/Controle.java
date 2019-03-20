package br.com.fiap.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.model.PedidoDto;



@RestController
@RequestMapping("/orderService")
public class Controle {

	@GetMapping("/pedido")
	public PedidoDto retornaPedido() {

		PedidoDto item = new PedidoDto();

		item.setIdPedido(1L);
		item.setNomeCliente("leandro Jorge");
		item.setItemAdquirido("Placa arduino");

		return item;
	}

	@GetMapping("/health")
	public boolean retornarh() {
		return true;
		
		
	}
}
