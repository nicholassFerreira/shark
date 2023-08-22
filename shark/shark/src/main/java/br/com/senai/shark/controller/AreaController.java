package br.com.senai.shark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.AreaService;

@RestController
public class AreaController {

	@Autowired
	private AreaService areaService;

	@GetMapping("/area")
	public String calculaArea(@RequestParam String forma, @RequestParam (required = false) Double base, @RequestParam (required = false) Double base2,
			@RequestParam (required = false) Double altura, @RequestParam (required = false) Double raio) {

		return "A aréa do " + forma + " é " + areaService.calculaArea(forma, base, base2, altura, raio);

	}

}
