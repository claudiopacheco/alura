
public class ExercicioOpcionalPraticandoLacosComFatorial {

	public static void main(String[] args) {

		int contador = 1, fatorial = 1;
		int numero = 6;
		while (contador <= numero) {
			fatorial *= contador;
			contador++;
		}
		System.out.println(fatorial);
	}

}
