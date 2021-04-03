
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario nico = new Gerente();
		nico.setNome("Robin");
		nico.setCpf("181457568");
		nico.setSalario(2500.0);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		
		Funcionario dacio = new Gerente();
		dacio.setNome("Dacio");
		dacio.setCpf("845");
		dacio.setSalario(10000.0);

	}

}
