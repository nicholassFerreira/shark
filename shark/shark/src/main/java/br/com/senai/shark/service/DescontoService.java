package br.com.senai.shark.service;

import org.springframework.stereotype.Service;

@Service
public class DescontoService {

	public Double calculaDesconto(Double valor) {

		if (valor <= 1500) {

			return valor * 0.95;

		} else if (valor > 1500 && valor <= 10000) {

			return valor * 0.9;

		} else if (valor > 10000) {

			return valor * 0.88;

		}

		return 0d;

	}

}
