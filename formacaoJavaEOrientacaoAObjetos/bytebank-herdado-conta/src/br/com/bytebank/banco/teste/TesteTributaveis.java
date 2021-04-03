package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 9473249);
		cc.deposita(200);
		
		SeguroDeVida sdv = new SeguroDeVida();
		
		CalculadorDeImposto calcImposto = new CalculadorDeImposto();
		calcImposto.registra(cc);
		calcImposto.registra(sdv);
		
		System.out.println(calcImposto.getTotalImposto());

	}

}
