package br.com.senai.shark.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class HelloService {

	public void validaIdade(Integer idade) {

		if (idade == null || idade > 10) {

			throw new RuntimeException("Idade deve ser maior ou igual a 10");
		}

	}


	
}
