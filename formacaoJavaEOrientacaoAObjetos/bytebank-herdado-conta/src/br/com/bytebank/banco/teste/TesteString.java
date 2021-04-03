package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String teste = "Teste sintaxe literal";
		String teste2 = new String("Teste sintaxe normal");
		
		String nova = teste.replace('e', 'a');
		System.out.println(nova);
		
		nova = nova.toLowerCase();
		System.out.println(nova);
		
		nova = nova.toUpperCase();
		System.out.println(nova);
		
		System.out.println("charAt: " + nova.charAt(0));
		
		System.out.println("indexOf: " + nova.indexOf('A', 2));
		
		System.out.println("substring: " + nova.substring(6, 13));
		
		for(int i = 0; i < nova.length(); i++) {
			System.out.println(nova.charAt(i));
		}
		
		System.out.println(nova.isEmpty());
		
		nova = "                               " + nova + "!        .    ";
		System.out.println(nova);
		nova = nova.trim();
		System.out.println(nova);
		
		System.out.println(nova.contains("LIT"));
		String[] nova2 = nova.split("!");
		for(String a : nova2) {
			System.out.println("index" + a);
		}
		
	}

}
