
public class AcaoBolsa implements Tributavel {
	
	double valorBrutoTotal;

	@Override
	public double getValorImposto() {
		return valorBrutoTotal * 0.5;
	}

}
