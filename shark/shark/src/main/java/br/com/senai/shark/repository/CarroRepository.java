package br.com.senai.shark.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import br.com.senai.shark.model.Carro;


public interface CarroRepository extends JpaRepository<Carro, Integer>{

	
	List<Carro> findByMarca(String marca);
	
	List<Carro> findByModeloAndAno(String modelo, Integer ano);
	
	List<Carro> findByAnoLessThan (Integer ano);

	@Modifying
	void deleteByMarca(String marca);
}
