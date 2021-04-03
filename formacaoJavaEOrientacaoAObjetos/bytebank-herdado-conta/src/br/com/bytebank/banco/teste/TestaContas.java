package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		ContaCorrente cc1 = new ContaCorrente(111, 84723823);
		cc1.deposita(100);
		
		ContaPoupanca cp1 = new ContaPoupanca(2, 847239);
		cp1.deposita(50);
		cp1.transfere(5, cc1);
		
		System.out.println("CC:" + cc1.getSaldo());
		System.out.println("CP:" + cp1.getSaldo());
		
		cc1.saca(500);
		System.out.println("CC:" + cc1.getSaldo());
	}

}
