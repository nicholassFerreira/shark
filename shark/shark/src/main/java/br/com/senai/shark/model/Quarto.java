package br.com.senai.shark.model;

import br.com.senai.shark.dto.QuartoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Quarto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer numero;
	private Integer andar;
	@OneToOne
	@JoinColumn(name = "paciente_id")
	private Paciente paciente;

	public Quarto(QuartoDto quartoDto) {

		this.id = quartoDto.getId();
		this.andar = quartoDto.getAndar();
		this.numero = quartoDto.getNumero();
		this.paciente = new Paciente(quartoDto.getPaciente().getId(), quartoDto.getPaciente().getNome(),
				quartoDto.getPaciente().getCpf(), quartoDto.getPaciente().getQuarto());

	}

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

	public Quarto(Integer id, Integer numero, Integer andar) {
		super();
		this.id = id;
		this.numero = numero;
		this.andar = andar;
	}

	public Quarto() {
		super();
	}

}
