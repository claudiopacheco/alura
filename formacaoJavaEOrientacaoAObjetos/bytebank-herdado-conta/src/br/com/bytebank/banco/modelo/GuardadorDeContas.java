package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Object[] referencias;
	int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		posicaoLivre = 0;
	}

	public void adiciona(Conta ref) {
		referencias[this.posicaoLivre] = ref;
		posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int i) {
		return referencias[i];
	}

}
