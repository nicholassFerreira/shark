package br.com.senai.shark.dto;

import java.time.LocalDate;

import br.com.senai.shark.model.Produto;

public class ProdutoDto {

	private int id;
	private String titulo;
	private String descricao;
	private double preco;
	private LocalDate prazoEntrega;

	public ProdutoDto(int id, String titulo, String desc, double preco, LocalDate prazoEntrega) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = desc;
		this.preco = preco;
		this.prazoEntrega = prazoEntrega;
	}

	public ProdutoDto(Produto produto) {

		this.descricao = produto.getDescricao();
		this.id = produto.getId();
		this.prazoEntrega = produto.getPrazoEntrega();
		this.preco = produto.getPreco();
		this.titulo = produto.getTitulo();
	}
	
	public ProdutoDto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String desc) {
		this.descricao = desc;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public LocalDate getPrazoEntrega() {
		return prazoEntrega;
	}

	public void setPrazoEntrega(LocalDate prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	}
