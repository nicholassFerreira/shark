package br.com.senai.shark.model;

import java.util.List;

import br.com.senai.shark.dto.DependenteDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "dependente")
public class Dependente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpf;
	@ManyToMany(mappedBy = "dependente")
	private List<Empregado> empregado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Dependente() {
		super();
	}

	public Dependente(Integer id, String nome, String cpf, List<Empregado> empregado) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.empregado = empregado;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Empregado> getEmpregado() {
		return empregado;
	}

	public void setEmpregado(List<Empregado> empregado) {
		this.empregado = empregado;
	}

	public Dependente(DependenteDto dependenteDto) {

		this.id = dependenteDto.getId();
		this.cpf = dependenteDto.getCpf();
		this.nome = dependenteDto.getNome();
		this.empregado = dependenteDto.getEmpregadoDto().stream().map(Empregado::new).toList();
	}

}
