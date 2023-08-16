package br.com.senai.shark.service;

import org.springframework.stereotype.Service;

@Service
public class NotasService {

public static Double somaNota(String notas) {
		
		String[] listaNotas = notas.split(",");
		
		
		
		
		
		return calculaMedia(listaNotas);
	
		
	}

	public static Double calculaMedia(String[] listaNotas) {
	
		double soma=0;
		double media=0;
		
		for (int i = 0; i < listaNotas.length; i++) {
			
			soma = soma + Double.parseDouble(listaNotas[i]);
			
			
		}
		
		return media = soma / listaNotas.length;
		
	}
	 
}
