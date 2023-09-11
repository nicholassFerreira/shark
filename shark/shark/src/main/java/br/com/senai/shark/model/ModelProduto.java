package br.com.senai.shark.model;

import java.time.LocalDate;

import br.com.senai.shark.dto.ProdutoDto;

public class ModelProduto {

	private Integer id;
	private String titulo;
	private String desc;
	private Double preco;
	private LocalDate prazoEntrega;

	public ModelProduto(int id, String titulo, String desc, double preco, LocalDate prazoEntrega) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.desc = desc;
		this.preco = preco;
		this.prazoEntrega = prazoEntrega;
	}

	public ModelProduto(ProdutoDto dto) {

		this.desc = dto.getDesc();
		this.id = dto.getId();
		this.prazoEntrega = dto.getPrazoEntrega();
		this.preco = dto.getPreco();
		this.titulo = dto.getTitulo();
	}

	public ModelProduto() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public LocalDate getPrazoEntrega() {
		return prazoEntrega;
	}

	public void setPrazoEntrega(LocalDate prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}

}
