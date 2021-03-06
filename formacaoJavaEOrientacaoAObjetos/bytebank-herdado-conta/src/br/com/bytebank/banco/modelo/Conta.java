package br.com.bytebank.banco.modelo;

/**
 * Classe que representa uma conta no ByteBank
 * 
 * @author cpacheco
 * @version 0.1
 *
 */

public abstract class Conta {

	protected double saldo;
	private int agencia;
	public int numero;
	private Cliente titular;
	
	private static int totalContas = 0;
	
	/**
	 * Construtor para inicializar o objeto da classe Conta a partir da agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Criando uma conta");
		Conta.totalContas++;
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser menor ou igual ao saldo
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException{
		if (this.saldo < valor){
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta contaDestino) throws SaldoInsuficienteException {
		this.saca(valor);
		contaDestino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotalContas() {
		return Conta.totalContas;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia " + this.agencia;
	}
	
	/*Equals ? um padr?o universal para compara??o de objetos, 
     * ent?o se algu?m que n?o conhece o seu projeto e quer comparar 
     * dois objetos contas, essa pessoa vai tentar usar imediatamente o equals.*/
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if (this.agencia != outra.agencia) {
			return false;
		}
		
		if (this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
}
