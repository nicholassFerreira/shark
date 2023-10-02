package br.com.senai.shark.dto;

import br.com.senai.shark.model.Paciente;
import br.com.senai.shark.model.Quarto;

public class PacienteDto {

	private Integer id;
	private String nome;
	private String cpf;
	private Quarto quarto;
	
	public PacienteDto (Paciente paciente) {
		
		this.id = paciente.getId();
		this.nome = paciente.getNome();
		this.cpf = paciente.getCpf();
		this.quarto = paciente.getQuarto();
		
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
	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	public PacienteDto(Integer id, String nome, String cpf, Quarto quarto) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.quarto = quarto;
	}
	public PacienteDto() {
		super();
	}

	
	
}
