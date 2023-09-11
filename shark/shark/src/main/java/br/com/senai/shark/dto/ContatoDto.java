package br.com.senai.shark.dto;

import br.com.senai.shark.model.ModelContato;

public class ContatoDto {

	private int id;
	private String nome;
	private String numero;
	private char tipo;

	public ContatoDto(int id, String nome, String numero, char tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.numero = numero;
		this.tipo = tipo;
	}

	public ContatoDto(ModelContato contato) {

		this.id = contato.getId();
		this.nome = contato.getNome();
		this.numero = contato.getNumero();
		this.tipo = contato.getTipo();

	}

	public ContatoDto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

}
