
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public double getBonificacao() {
		return super.getSalario();
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
