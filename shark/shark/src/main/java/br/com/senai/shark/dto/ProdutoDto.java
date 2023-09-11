package br.com.senai.shark.dto;

import java.time.LocalDate;

import br.com.senai.shark.model.ModelProduto;

public class ProdutoDto {

	private int id;
	private String titulo;
	private String desc;
	private double preco;
	private LocalDate prazoEntrega;

	public ProdutoDto(int id, String titulo, String desc, double preco, LocalDate prazoEntrega) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.desc = desc;
		this.preco = preco;
		this.prazoEntrega = prazoEntrega;
	}

	public ProdutoDto(ModelProduto produto) {

		this.desc = produto.getDesc();
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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