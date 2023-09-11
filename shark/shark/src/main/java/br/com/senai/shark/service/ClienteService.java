package br.com.senai.shark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.ClienteDto;
import br.com.senai.shark.model.ModelCliente;
import br.com.senai.shark.model.ModelContato;
import br.com.senai.shark.repository.ClienteRepository;

@Service

public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public ModelCliente salvarCliente(ClienteDto clienteDto) {

		ModelCliente cliente = new ModelCliente(clienteDto);

		return clienteRepository.save(cliente);

	}

	public List<ModelCliente> listarTodos() {

		return clienteRepository.findAll();

	}

	public void excluirCliente(Integer id) {

		clienteRepository.deleteById(id);

	}

}