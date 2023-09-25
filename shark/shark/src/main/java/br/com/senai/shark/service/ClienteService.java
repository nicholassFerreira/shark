package br.com.senai.shark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.ClienteDto;
import br.com.senai.shark.model.Cliente;
import br.com.senai.shark.model.Contato;
import br.com.senai.shark.repository.ClienteRepository;

@Service

public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente salvarCliente(ClienteDto clienteDto) {

		Cliente cliente = new Cliente(clienteDto);

		return clienteRepository.save(cliente);

	}

	public List<Cliente> listarTodos() {

		return clienteRepository.findAll();

	}

	public void excluirCliente(Integer id) {

		clienteRepository.deleteById(id);

	}

}
