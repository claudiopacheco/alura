
public abstract class Conta {
	
	private int numero;
	private int agencia;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta(int numero, int agencia) {
		this.numero = numero;
		this.agencia = agencia;
	}
	
	public int getNumero(int numero) {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia(int agencia) {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(valor >= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transfere(Conta contaDestino, double valor) {
		if(saca(valor)) {
			contaDestino.deposita(valor);
			return true;
		}
		return false;
	}

}
