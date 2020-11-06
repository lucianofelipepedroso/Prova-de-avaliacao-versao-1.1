package br.com.confidencecambio.javabasico.main;

import br.com.confidencecambio.javabasico.exception.NomeException;
import br.com.confidencecambio.javabasico.factory.SimpleConfiNomeFactory;
import br.com.confidencecambio.javabasico.modelo.ConfigNome;

public class Main {

	public static void main(String[] args) {

		ConfigNome configNome = null;

		try {
			//configNome = SimpleConfiNomeFactory.create("Cliente", "Luciano Felipe Pedroso");
			//configNome = SimpleConfiNomeFactory.create("Robo", "Robo Teste");
			configNome = SimpleConfiNomeFactory.create("Gerente", "Jose Carlos Almeida Da Silva");

		} catch (NomeException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(configNome.primeiroNome());

		try {
			System.out.println(configNome.ultimoNome());
		} catch (NomeException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(configNome.nomeAbreviado());
		} catch (NomeException e) {
			System.out.println(e.getMessage());
		}

	}

}
