package br.com.confidencecambio.javabasico.factory;

import br.com.confidencecambio.javabasico.exception.NomeException;
import br.com.confidencecambio.javabasico.modelo.Cliente;
import br.com.confidencecambio.javabasico.modelo.ConfigNome;
import br.com.confidencecambio.javabasico.modelo.Gerente;
import br.com.confidencecambio.javabasico.modelo.Robo;

public class SimpleConfiNomeFactory {

	public static ConfigNome create(String tipo, String nome) throws NomeException {

		if (tipo.equals("Cliente")) {
			return new Cliente(nome);
		} else if (tipo.equals("Robo")) {
			return new Robo(nome);
		} else if (tipo.equals("Gerente")) {
			return new Gerente(nome);
		}
		return null; 

	}

}
