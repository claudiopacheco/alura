
public class TesteReferencias {

	public static void main(String[] args) {
		ControleBonificacao cb1 = new ControleBonificacao();
		
		System.out.println("Gerente");
		Gerente g1 = new Gerente();
		g1.setSalario(10000);	
		System.out.println(g1.getBonificacao());
		cb1.registra(g1);
		System.out.println(cb1.getSoma());
		
		System.out.println("EditorVideo");
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(5000);	
		System.out.println(ev1.getBonificacao());
		cb1.registra(ev1);
		System.out.println(cb1.getSoma());
		
		System.out.println("Designer");
		Designer d1 = new Designer();
		d1.setSalario(1000);	
		System.out.println(d1.getBonificacao());
		cb1.registra(d1);
		System.out.println(cb1.getSoma());

	}

}
