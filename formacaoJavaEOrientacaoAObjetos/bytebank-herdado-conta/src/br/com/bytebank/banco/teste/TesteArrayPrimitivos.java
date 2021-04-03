package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		/*
		idades[0] = 15;
		idades[1] = 18;
		idades[2] = 21;
		idades[3] = 23;
		idades[4] = 25;
		
		int idade = idades[3];
		System.out.println(idade);
		System.out.println(idades.length);
		*/
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i*i;
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

	}

}
