package br.com.senai.shark.service;

import org.springframework.stereotype.Service;

@Service
public class ImcService {

	public Double CalculaIMC(Double peso, Double altura) {

		return peso / altura;

	}

	public String getImcCategoria(Double imc) {

		if (imc >= 18.5 && imc <= 24.99) {

			return "Normal";

		} else if (imc >= 25 && imc <= 29.99) {

			return "pré obeso";

		} else if (imc >= 30 && imc <= 34.99) {
			
			return "obesidade 1";

		} else if (imc >= 35 && imc <= 40) {

			return "obesidade 2";

		}

		return "";

	}

}
