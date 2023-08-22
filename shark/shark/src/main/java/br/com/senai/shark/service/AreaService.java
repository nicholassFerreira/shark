package br.com.senai.shark.service;

import org.springframework.stereotype.Service;

@Service
public class AreaService {

	public double calculaArea(String lowerCase, Double base, Double base2, Double altura, Double raio) {

		switch (lowerCase) {
		case "quadrado":

			return base * base;

		case "retângulo":

			return base * base2;

		case "retangulo":

			return base * altura / 2;

		case "triângulo":

			return base * altura / 2;

		case "triangulo":

			return base * altura / 2;

		case "circulo":

			return Math.PI * raio * raio;

		case "trapezio":

			return (base + base2) * altura / 2;

		case "trapézio":

			return (base + base2) * altura / 2;

		}

		return 0d;

	}

}
