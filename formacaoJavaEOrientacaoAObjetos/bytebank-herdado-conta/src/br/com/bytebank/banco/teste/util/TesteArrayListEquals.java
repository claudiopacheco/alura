package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args){

	    ArrayList<Conta> lista = new ArrayList<Conta>();

	    Conta cc1 = new ContaCorrente(22, 22);
	    Conta cc2 = new ContaCorrente(22, 22);

	    lista.add(cc1);

	    /* Por baixo dos panos, o m�todo contains() vai pegando cada elemento da lista 
	     * e fazendo as compara��es usando o m�todo equals() at� achar algum que corresponda � procura.*/
	    boolean existe = lista.contains(cc2); 
	    System.out.println("J� existe? " + existe);
	    
	    /* Equals � um padr�o universal para compara��o de objetos, 
	     * ent�o se algu�m que n�o conhece o seu projeto e quer comparar 
	     * dois objetos contas, essa pessoa vai tentar usar imediatamente o equals.*/
	    boolean igual = cc1.equals(cc2);
	    System.out.println(igual);

	    for(Conta conta : lista){
	        System.out.println(conta);
	    }
	}
}
