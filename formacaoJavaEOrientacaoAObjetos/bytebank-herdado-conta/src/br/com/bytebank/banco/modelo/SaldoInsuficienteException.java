package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(String msge) {
		super(msge);
	}
}
