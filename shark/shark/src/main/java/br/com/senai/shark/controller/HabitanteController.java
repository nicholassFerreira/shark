package br.com.senai.shark.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.HabitanteDto;

@RestController
@RequestMapping("/habitante")
public class HabitanteController {

	private static List<HabitanteDto> listaHabitante = new ArrayList<>();

	@PostMapping
	public ResponseEntity<HabitanteDto> criaHabitante(@RequestBody HabitanteDto habitante) {

		listaHabitante.add(habitante);

		return ResponseEntity.ok(habitante);

	}

	@GetMapping
	public ResponseEntity<List<HabitanteDto>> findHabitantePorSalarioOUFilhos(
			@RequestParam(required = false) Double salario, @RequestParam(required = false) Integer filhos) {

		if (salario != null && filhos != null) {

			List<HabitanteDto> listaFiltrada = listaHabitante.stream()
					.filter(habitante -> habitante.getSalario() > salario || habitante.getNumeroFilhos() > filhos)
					.toList();

			return ResponseEntity.ok(listaFiltrada);

		} else {

			return ResponseEntity.ok(listaHabitante);

		}
	}

}
