package br.com.confidencecambio.javabasico.modelo;

import br.com.confidencecambio.javabasico.exception.NomeException;

public abstract class ConfigNome {

	private String nome;
	private String[] tokens;
	private String nomeClasse;

	protected ConfigNome(String nome) throws NomeException {
		this.nome = nome;
		verificaNome();
		splitNome();
		nomeClasse = getClass().getSimpleName();
	}

	private void verificaNome() throws NomeException {
		if ((nome == null) || nome.isEmpty() || nome.isBlank()) {
			throw new NomeException(nomeClasse + ": Nome não poder ser nulo, vazio ou em branco");
		}

	}

	public String primeiroNome() {
		return nomeClasse + "=>" + tokens[0].trim();

	}

	public String ultimoNome() throws NomeException {
		String ultimo = "";
		if (tokens.length - 1 == 0) {
			throw new NomeException(nomeClasse + " não possui sobrenome");
		} else {

			for (int i = 1; i < tokens.length; i++) {
				ultimo += tokens[i] + " ";
			}

			return nomeClasse + "=>" + ultimo.trim();
		}

	}

	public String nomeAbreviado() throws NomeException {
		String abreviado="";
		if (tokens.length < 3) {
			throw new NomeException(nomeClasse + " não possível fazer abreviação do nome");
		}

		abreviado+= tokens[0] + " ";
		for (int i=1;i < tokens.length-1;i++) {
           abreviado += tokens[i].charAt(0) + ". ";
		}
		abreviado+= tokens[tokens.length-1];
		return nomeClasse + "=>" + abreviado.trim();
	}

	private String[] splitNome() {
		tokens = nome.split("\\ ");
		return tokens;

	}

	public String getNomeMaiusculo() {
		return nomeClasse+ "=>" + nome.trim().toUpperCase();
	}

}
