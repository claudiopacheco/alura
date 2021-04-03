
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente dacio = new Gerente();
		dacio.setNome("Dacio");
		dacio.setCpf("9827328");
		dacio.setSalario(1000.0);
		
		System.out.println(dacio.getNome());
		System.out.println(dacio.getCpf());
		System.out.println(dacio.getSalario());
		
		System.out.println(dacio.autentica(1111));
		dacio.setSenha(9889);
		System.out.println(dacio.autentica(9889));
		
		System.out.println("Bonificacao: " + dacio.getBonificacao());

	}

}
