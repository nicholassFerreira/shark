package br.com.senai.shark.dto;

public class HabitanteDto {

	private String nome;
	private String cidade;
	private double salario;
	private int numeroFilhos;

	public HabitanteDto(String nome, String cidade, double salario, int numeroFilhos) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.salario = salario;
		this.numeroFilhos = numeroFilhos;
	}

	public HabitanteDto() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getNumeroFilhos() {
		return numeroFilhos;
	}

	public void setNumeroFilhos(int numeroFilhos) {
		this.numeroFilhos = numeroFilhos;
	}

}
