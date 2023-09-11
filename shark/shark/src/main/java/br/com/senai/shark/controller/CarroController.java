package br.com.senai.shark.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.ls.LSInput;

import br.com.senai.shark.dto.CarroDto;
import br.com.senai.shark.model.ModelCarro;
import br.com.senai.shark.service.CarroService;
import br.com.senai.shark.service.CarroService1;

@RestController
@RequestMapping("/carro")
public class CarroController {

	@Autowired
	private CarroService carroService;

	@PostMapping
	public ResponseEntity<CarroDto> cadastrarCarro(@RequestBody CarroDto carrodto) {
		ModelCarro carro = carroService.salvarCarro(carrodto);
		return ResponseEntity.ok(new CarroDto(carro));

	}
	
	@GetMapping
	public ResponseEntity<List<CarroDto>> listarCarros(){
		List<ModelCarro> carros = carroService.listarCarros();
		List<CarroDto> carrosDto = carros.stream().map(CarroDto::new).toList();
		
		return ResponseEntity.ok(carrosDto);
		
	}
		
	private static List<CarroDto> listaCarro = new ArrayList<>();
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable Integer id) {
		
		carroService.excluirCarro(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PutMapping
	public ResponseEntity<CarroDto> atualizacarro(@RequestBody CarroDto carroDto) {
		ModelCarro carroAtualizado = carroService.salvarCarro(carroDto);
		
		return ResponseEntity.ok(new CarroDto(carroAtualizado));
	}
	
	

//	@PostMapping
//	public ResponseEntity<CarroDto> criaCarro(@RequestBody CarroDto carroDto) {
//		Carro carro = carroService.inserirCarro(carroDto);
//		return ResponseEntity.ok(new CarroDto(carro));
//
//	}
//
//	@GetMapping
//	public ResponseEntity<List<CarroDto>> findCarroBy(@RequestParam(required = false) String marca,
//			@RequestParam(required = false) String modelo, @RequestParam(required = false) Integer ano) {
//
//		// 1 - marca / 2 - modelo / 3 - ano
//
//		if (marca != null) {
//
//			return (ResponseEntity<List<CarroDto>>) carroService.findCarroBy(marca, 1, listaCarro);
//
//		} else if (modelo != null) {
//
//			return (ResponseEntity<List<CarroDto>>) carroService.findCarroBy(modelo, 2, listaCarro);
//
//		} else if (ano != null) {
//
//			return (ResponseEntity<List<CarroDto>>) carroService.findCarroBy(String.valueOf(ano), 3, listaCarro);
//
//		} else {
//
//			return null;
//
//		}
//
//	}

}
