package br.com.confidencecambio.javabasico.modelo;

import br.com.confidencecambio.javabasico.exception.NomeException;

public class Cliente extends ConfigNome{

	public Cliente(String nome) throws NomeException {
		super(nome);
		
	}

}
