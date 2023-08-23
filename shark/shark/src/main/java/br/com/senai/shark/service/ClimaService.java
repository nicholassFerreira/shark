package br.com.senai.shark.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.ClimaDto;

@Service
public class ClimaService {

	public static double calculaMediaTempPorCidade(String nomeCidade, List<ClimaDto> listaClima) {

		double somaTemp = 0;

		double controleNmrCidades = 0;

		for (ClimaDto climaDto : listaClima) {

			if (nomeCidade.equals(climaDto.getCidade())) {

				somaTemp += climaDto.getTemperatura();

				controleNmrCidades++;

			}

		}

		return somaTemp / controleNmrCidades;
	}

	public double calculaMediaTempGeral(List<ClimaDto> listaClima) {

		double soma = 0;

		for (ClimaDto climaDto : listaClima) {

			soma += climaDto.getTemperatura();

		}

		return soma / listaClima.size();
	}

}
