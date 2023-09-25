package br.com.senai.shark.dto;

import java.time.LocalDate;

import br.com.senai.shark.model.Pessoa;

public class PessoaDto {

	private String nome;
	private String cpf;
	private String profissao;
	private LocalDate dtNascDate;
	private String genero;

	
	
	public PessoaDto(String nome, String cpf, String profissao, LocalDate dtNascDate, String genero) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.dtNascDate = dtNascDate;
		this.genero = genero;
	}

	public PessoaDto() {
		
		super();
		
	}

	public PessoaDto (Pessoa p) {
	
		this.cpf=p.getCpf();
		this.nome=p.getNome();
		
		
		
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


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}


	public LocalDate getDtNascDate() {
		return dtNascDate;
	}


	public void setDtNascDate(LocalDate dtNascDate) {
		this.dtNascDate = dtNascDate;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
