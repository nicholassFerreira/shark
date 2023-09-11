package br.com.senai.shark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.model.ModelPessoa;
import br.com.senai.shark.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public ModelPessoa inserePessoa(ModelPessoa p) {
		return pessoaRepository.save(p);

	}

	public List<ModelPessoa> listarPessoas() {

		return pessoaRepository.findAll();

	}

	public void deletePessoaBy(ModelPessoa p) {

		pessoaRepository.deleteById(p.getId());

	}

}
