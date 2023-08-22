package br.com.senai.shark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.ImcService;

@RestController
public class ImcController {

	@Autowired
	private ImcService imcService;

	@GetMapping("/imc")
	public String calculaIMC(@RequestParam Double peso, @RequestParam Double altura) {

		return "O seu IMC é " + imcService.CalculaIMC(peso, altura) + " e você se encontra na categoria: "
				+ imcService.getImcCategoria(imcService.CalculaIMC(peso, altura));

	}

}
