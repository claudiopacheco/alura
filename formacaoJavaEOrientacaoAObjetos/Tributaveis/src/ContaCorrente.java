
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.1;
	}

}
