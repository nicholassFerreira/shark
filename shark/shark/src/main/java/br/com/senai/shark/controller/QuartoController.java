package br.com.senai.shark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.QuartoService;

@RestController
@RequestMapping("/quarto")
public class QuartoController {

	@Autowired
	private QuartoService quartoService;
	
	
}
