package bytebank;

public class TestaMetodos {

	public static void main(String[] args) {
		/*
		Conta cliente1 = new Conta();
		Conta cliente2 = new Conta();
		
		System.out.println("Saldo do cliente 1: " + cliente1.saldo);
		System.out.println("Saldo do cliente 2: " + cliente2.saldo);
		
		System.out.println("Depositando 50 em cada conta...");
		cliente1.deposita(50);
		cliente2.deposita(50);
		
		System.out.println("Saldo do cliente 1: " + cliente1.saldo);
		System.out.println("Saldo do cliente 2: " + cliente2.saldo);
		
		System.out.println("Transferindo 5 Reais do cliente 1 para cliente 2...");
		cliente1.transfere(5, cliente2);
		System.out.println("Saldo do cliente 1: " + cliente1.saldo);
		System.out.println("Saldo do cliente 2: " + cliente2.saldo);
		
		
		Conta contaDoClaudio = new Conta();
		contaDoClaudio.setAgencia(1234);
		contaDoClaudio.setNumero(987653);
		System.out.println(contaDoClaudio.getAgencia());
		System.out.println(contaDoClaudio.getNumero());
		System.out.println(contaDoClaudio.getSaldo());
		contaDoClaudio.deposita(20000);
		System.out.println(contaDoClaudio.getSaldo());
		System.out.println(contaDoClaudio.getTitular());
		
		Cliente claudio = new Cliente();
		claudio.setCpf("15918291282191");
		claudio.setNome("Claudio VRP");
		claudio.setProfissao("TBD");
		
		contaDoClaudio.setTitular(claudio);
		System.out.println(contaDoClaudio.getTitular());
		System.out.println(contaDoClaudio.getTitular().getNome());
		
		int aleatorio;
		System.out.println(aleatorio);
		*/
		
		Conta conta1 = new Conta(12459, 641901);
		System.out.println(conta1.getAgencia());
		System.out.println(conta1.getNumero());
		System.out.println(conta1.getSaldo());
		
		System.out.println(Conta.getTotalContas());
		
		Conta conta2 = new Conta(12121, 35354353);
		
		System.out.println(Conta.getTotalContas());
	}
	
}
