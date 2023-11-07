package br.com.senai.shark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.QuartoDto;
import br.com.senai.shark.model.Quarto;
import br.com.senai.shark.repository.QuartoRepository;

@Service
public class QuartoService {

	@Autowired
	private QuartoRepository quartoRepository;

	public Quarto salvarQuarto(QuartoDto quartoDto) {

		Quarto quarto = new Quarto(quartoDto);
		return quartoRepository.save(quarto);

	}
	
	

}
