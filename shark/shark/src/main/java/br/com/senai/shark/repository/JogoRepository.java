package br.com.senai.shark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.shark.model.ModelJogo;

public interface JogoRepository extends JpaRepository<ModelJogo, Integer> {

}