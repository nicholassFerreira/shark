package br.com.senai.shark.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.ClimaDto;

@RestController
@RequestMapping("/clima")
public class ClimaController {

	private static List<ClimaDto> listaClima = new ArrayList<>();
	
	
	
}
