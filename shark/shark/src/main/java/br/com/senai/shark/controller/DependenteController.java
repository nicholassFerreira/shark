package br.com.senai.shark.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.DependenteDto;
import br.com.senai.shark.model.Dependente;
import br.com.senai.shark.service.DependenteService;

@RestController
@RequestMapping("/dependente")
public class DependenteController {

	private DependenteService dependenteService;
	
	@PostMapping
	public ResponseEntity<DependenteDto> cadastrarDependente (@RequestBody DependenteDto dependenteDto) {
		
		Dependente dependente = dependenteService.salvarDependente(dependenteDto);
		
		return null;
		
	}
	
}
