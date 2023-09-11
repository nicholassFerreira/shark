package br.com.senai.shark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.shark.model.ModelContato;

public interface ContatoRepository extends JpaRepository<ModelContato, Integer> {

}
