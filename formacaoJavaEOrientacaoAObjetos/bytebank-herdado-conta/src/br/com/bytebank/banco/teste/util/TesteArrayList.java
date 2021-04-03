package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		// Generics
		List<Conta> lista = new ArrayList<Conta>(); // Polimorfismo: Referência tipo List de Conta, objeto
													// tipo ArrayList (tb poderia ser LinkedList ou Vector)
		
		Conta cc1 = new ContaCorrente(111111111, 22);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(22222222, 44);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(333333333, 311);
        lista.add(cc3);
        
        Conta cc4 = new ContaCorrente(4444444, 322);
        lista.add(cc4);
        
        for(int i = 0; i < lista.size(); i++) {
        	Object oRef = lista.get(i);
        	System.out.println(oRef);
        }
        
        System.out.println("----------------------------");
        
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		

	}

}
