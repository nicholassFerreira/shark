package br.com.senai.shark.model;

import java.time.LocalDate;

import br.com.senai.shark.dto.ProdutoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String descricao;
	private Double preco;
	private LocalDate prazoEntrega;

	public Produto(int id, String titulo, String desc, double preco, LocalDate prazoEntrega) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = desc;
		this.preco = preco;
		this.prazoEntrega = prazoEntrega;
	}

	public Produto(ProdutoDto dto) {

		this.descricao = dto.getDescricao();
		this.id = dto.getId();
		this.prazoEntrega = dto.getPrazoEntrega();
		this.preco = dto.getPreco();
		this.titulo = dto.getTitulo();
	}

	public Produto() {
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String desc) {
		this.descricao = desc;
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
