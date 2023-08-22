package br.com.senai.shark.dto;

import java.time.LocalDate;

public class ClimaDto {

	private String cidade;
	private LocalDate data;
	private double temperatura;

	public ClimaDto(String cidade, LocalDate data, double temperatura) {
		super();
		this.cidade = cidade;
		this.data = data;
		this.temperatura = temperatura;
	}

	public ClimaDto() {
		super();
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

}
