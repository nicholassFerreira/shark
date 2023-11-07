package br.com.senai.shark.dto;

import br.com.senai.shark.model.Paciente;

public class QuartoDto {

	private Integer id;
	private Integer numero;
	private Integer andar;
	private Paciente paciente;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getAndar() {
		return andar;
	}
	public void setAndar(Integer andar) {
		this.andar = andar;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public QuartoDto(Integer id, Integer numero, Integer andar, Paciente paciente) {
		super();
		this.id = id;
		this.numero = numero;
		this.andar = andar;
		this.paciente = paciente;
	}
	public QuartoDto() {
		super();
	}

	
	
}
