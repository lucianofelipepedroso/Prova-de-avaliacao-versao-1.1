package br.com.confidencecambio.javabasico.exception;

@SuppressWarnings("serial")
public class NomeException extends Exception {

	

	public NomeException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public NomeException(String message) {
		super(message);

	}

}
