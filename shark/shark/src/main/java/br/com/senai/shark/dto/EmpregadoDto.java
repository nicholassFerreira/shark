package br.com.senai.shark.dto;

import java.util.List;

import br.com.senai.shark.model.Empregado;

public class EmpregadoDto {

	private Integer id;
	private String nome;
	private String cpf;
	private Double salario;
	private List<DependenteDto> dependente;
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
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public List<DependenteDto> getDependente() {
		return dependente;
	}
	public void setDependente(List<DependenteDto> dependente) {
		this.dependente = dependente;
	}
	public EmpregadoDto(Integer id, String nome, String cpf, Double salario, List<DependenteDto> dependente) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.dependente = dependente;
	}
	public EmpregadoDto() {
		super();
	}
	
	public EmpregadoDto(Empregado empregado) {
		
		this.id = empregado.getId();
		this.cpf = empregado.getCpf();
		this.nome = empregado.getNome();
		this.salario = empregado.getSalario();
		this.dependente = empregado.getDependente().stream().map(DependenteDto::new).toList();
		
	}
	
}
