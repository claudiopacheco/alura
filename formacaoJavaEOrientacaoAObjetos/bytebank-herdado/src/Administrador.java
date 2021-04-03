
public class Administrador extends Funcionario implements Autenticavel {

	
	private AutenticacaoUtil autenticador;

	@Override
	public double getBonificacao() {
		return 150;
	}

	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}

}
