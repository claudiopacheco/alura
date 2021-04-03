
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setSenha(22223);
		
		SistemaInterno si1 = new SistemaInterno();
		si1.autentica(g1);

	}

}
