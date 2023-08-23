package br.com.senai.shark.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.ClimaDto;
import br.com.senai.shark.service.ClimaService;

@RestController
@RequestMapping("/clima")
public class ClimaController {

	private static List<ClimaDto> listaClima = new ArrayList<>();

	@Autowired
	private ClimaService climaService;

	@PostMapping
	public ResponseEntity<ClimaDto> salvaClima(@RequestBody ClimaDto climaDto) {

		listaClima.add(climaDto);

		return ResponseEntity.ok(climaDto);

	}

	@GetMapping
	public ResponseEntity<String> mediaTemperatura(@RequestParam(required = false) String nomeCidade) {

		if (nomeCidade != null) {

			return ResponseEntity.ok("A média da cidade " + nomeCidade + " é: "
					+ ClimaService.calculaMediaTempPorCidade(nomeCidade, listaClima));

		} else {

			return ResponseEntity.ok(
					"A temperatura média de todas as cidades é de " + climaService.calculaMediaTempGeral(listaClima));

		}

	}

}
