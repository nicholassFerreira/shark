package br.com.senai.shark.model;

import java.util.List;

import br.com.senai.shark.dto.DependenteDto;
import br.com.senai.shark.dto.EmpregadoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "empregados")
public class Empregado {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;
	private String cpf;
	private String cargo;
	private Double salario;
	@ManyToMany
	@JoinTable(

			name = "empragado_dependente", joinColumns = @JoinColumn(name = "empregado_id"), inverseJoinColumns = @JoinColumn(name = "dependente_id")

	)
	private List<Dependente> dependente;

	public Empregado(EmpregadoDto empregadoDto) {

		this.id = empregadoDto.getId();
		this.nome = empregadoDto.getNome();
		this.cpf = empregadoDto.getCpf();
		this.salario = empregadoDto.getSalario();
		this.dependente = empregadoDto.getDependente().stream().map(Dependente::new).toList();

	}

	public Empregado() {
		super();
	}

	public Empregado(Integer id, String nome, String cpf, String cargo, Double salario, List<Dependente> dependente) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		this.dependente = dependente;
	}

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

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public List<Dependente> getDependente() {
		return dependente;
	}

	public void setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
	}

}
