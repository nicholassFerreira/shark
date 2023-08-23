package br.com.senai.shark.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.CarroDto;
import br.com.senai.shark.service.CarroService;

@RestController
@RequestMapping("/carro")
public class CarroController {

	@Autowired
	private CarroService carroService;

	private static List<CarroDto> listaCarro = new ArrayList<>();

	public ResponseEntity<CarroDto> criaCarro(@RequestBody CarroDto carroDto) {

		listaCarro.add(carroDto);

		return ResponseEntity.ok(carroDto);

	}

	@GetMapping
	public ResponseEntity<List<CarroDto>> findCarroBy(@RequestParam(required = false) String marca,
			@RequestParam(required = false) String modelo, @RequestParam(required = false) Integer ano) {

		// 1 - marca / 2 - modelo / 3 - ano

		if (marca != null) {

			return (ResponseEntity<List<CarroDto>>) carroService.findCarroBy(marca, 1, listaCarro);

		} else if (modelo != null) {

			return (ResponseEntity<List<CarroDto>>) carroService.findCarroBy(modelo, 2, listaCarro);

		} else if (ano != null) {

			return (ResponseEntity<List<CarroDto>>) carroService.findCarroBy(String.valueOf(ano), 3, listaCarro);

		} else {

			return null;

		}

	}

}
