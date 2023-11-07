package br.com.senai.shark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.DependenteDto;
import br.com.senai.shark.model.Dependente;
import br.com.senai.shark.repository.DependenteRepository;

@Service
public class DependenteService {

	@Autowired
	private DependenteRepository dependenteRepository;
	
	public Dependente salvarDependente(DependenteDto dependenteDto) {
		
		
		
		return null;

		
		
		
	}

	
	
}
