package br.com.senai.shark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.PacienteDto;
import br.com.senai.shark.model.Paciente;
import br.com.senai.shark.repository.PacienteRepository;

@Service
public class PacienteService {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	public Paciente salvarPaciente(PacienteDto pacienteDto) {
		
		
		return null;
		
	}
	
}
