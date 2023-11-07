package br.com.senai.shark.dto;

import java.util.List;

import br.com.senai.shark.model.Dependente;

public class DependenteDto {

	private Integer id;
	private String nome;
	private String cpf;
	private List<EmpregadoDto> empregadoDto;
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
	public List<EmpregadoDto> getEmpregadoDto() {
		return empregadoDto;
	}
	public void setEmpregadoDto(List<EmpregadoDto> empregadoDto) {
		this.empregadoDto = empregadoDto;
	}
	public DependenteDto(Integer id, String nome, String cpf, List<EmpregadoDto> empregadoDto) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.empregadoDto = empregadoDto;
	}
	public DependenteDto() {
		super();
	}
	
	public DependenteDto(Dependente dependente) {
		
		this.id = dependente.getId();
		this.nome = dependente.getNome();
		this.cpf = dependente.getCpf();
		this.empregadoDto = dependente.getEmpregado().stream().map(EmpregadoDto::new).toList();
		
	}
	
}
