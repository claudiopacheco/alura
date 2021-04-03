
public class SeguroDeVida implements Tributavel {
	
	double mensalidade;

	@Override
	public double getValorImposto() {
		return mensalidade * 0.2;
	}

}
