package br.com.senai.shark.dto;


public class CarroDto {

	private String marca;
	private String modelo;
	private int ano;

	public CarroDto(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public CarroDto() {
		super();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setData(int ano) {
		this.ano = ano;
	}

}
