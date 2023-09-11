package br.com.senai.shark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.shark.model.ModelCarro;


public interface CarroRepository extends JpaRepository<ModelCarro, Integer>{

	
	
}
