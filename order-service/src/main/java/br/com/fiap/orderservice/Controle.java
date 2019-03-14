package br.com.fiap.orderservice;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class Controle {

	@RequestMapping(value = "/pedido", method = RequestMethod.GET)
	public PedidoDto retornaPedido() {

		PedidoDto item = new PedidoDto();

		item.setIdPedido(1L);
		item.setNomeCliente("leandro Jorge");
		item.setItemAdquirido("Placa arduino");

		return item;
	}

	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public boolean retornarh() {
		return true;
		
		
	}
}
