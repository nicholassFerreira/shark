package br.com.senai.shark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.DescontoService;

@RestController
public class DescontoController {

	@Autowired
	private DescontoService descontoService;
	
	@GetMapping("/desconto/{valor}")
	public String desconto(@PathVariable Double valor) {
		
	return "valor antes do desconto: " + valor + "<br> valor pós desconto: " + descontoService.calculaDesconto(valor);
		
		
	}
	
	
}
