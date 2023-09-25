package br.com.senai.shark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.ClienteDto;
import br.com.senai.shark.dto.ContatoDto;
import br.com.senai.shark.model.Contato;
import br.com.senai.shark.repository.ClienteRepository;
import br.com.senai.shark.repository.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;

	public Contato salvarContato(ContatoDto contato) {

		Contato novoContato = new Contato(contato);

		return contatoRepository.save(novoContato);

	}

	public List<Contato> listarTodos() {

		return contatoRepository.findAll();

	}

	public void excluirContato(Integer id) {

	}

}
