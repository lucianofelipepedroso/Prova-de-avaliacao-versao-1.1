package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Component;

@Component
public class IMCService {


	public String calculoIMC(String peso, String altura) {
		Double imc = Double.valueOf((peso)) / (Math.pow(Double.valueOf((altura)), 2));
		return String.format("%.2f kg/m2", imc);

	}

}
