package br.com.senai.shark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.CarroDto;
import br.com.senai.shark.model.ModelCarro;
import br.com.senai.shark.repository.CarroRepository;

@Service

public class CarroService1 {

	@Autowired
	private CarroRepository carroRepository;
	
	public ModelCarro inserirCarro(CarroDto carroDto) {
		
		ModelCarro carro = new ModelCarro(carroDto);
		return carroRepository.save(carro);
		
	}
	
	public List<ModelCarro> listarCarros() {
		
		return carroRepository.findAll();
		
	}
	
	public void excluirCarro(Integer id) {
		
		carroRepository.deleteById(id);
		
	}
	
	
}
