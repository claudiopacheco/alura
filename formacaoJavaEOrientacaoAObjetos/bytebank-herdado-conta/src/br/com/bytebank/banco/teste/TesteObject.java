package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		Object cc = new ContaCorrente(1, 2);
		System.out.println(cc);

		Object cp = new ContaPoupanca(2, 3);
		System.out.println(cp);
	}

}
