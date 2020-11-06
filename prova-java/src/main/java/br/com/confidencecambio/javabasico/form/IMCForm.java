package br.com.confidencecambio.javabasico.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class IMCForm {

	@NotNull
	@NotEmpty
	private String altura;

	@NotNull
	@NotEmpty
	private String peso;

	public IMCForm(String altura, String peso) {
		this.altura = altura;
		this.peso = peso;
	}

	public String getAltura() {
		return altura;
	}

	public String getPeso() {
		return peso;
	}

}
