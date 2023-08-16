package br.com.senai.shark.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.HelloService;

@RestController

public class HelloController {

	@Autowired
	private HelloService helloService;

	@GetMapping("/ola")
	public String olaMundo(@RequestParam(defaultValue = "mundo") String nome,
			@RequestParam(defaultValue = "000") Integer idade) {
		return "Ola, " + nome + " - " + idade;
	}

	@GetMapping("/ola/{nome}")
	public String olaNome(@PathVariable String nome) {

		return "ola, " + nome;

	}

	

}
