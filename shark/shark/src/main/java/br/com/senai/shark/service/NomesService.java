package br.com.senai.shark.service;

import org.springframework.stereotype.Service;

@Service
public class NomesService {

	public static String separaNomes(String nomes) {

		String somaLista = "";

		String[] nomesSeparados = nomes.split(",");

		for (String string : nomesSeparados) {

			somaLista += string + " - ";

		}

		return somaLista;
	}

}
