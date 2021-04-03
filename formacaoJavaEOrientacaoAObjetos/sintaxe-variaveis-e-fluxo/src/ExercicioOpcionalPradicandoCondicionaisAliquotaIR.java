public class ExercicioOpcionalPradicandoCondicionaisAliquotaIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario < 1900)
        	System.out.println("Isento");
        else if (salario >= 1900 && salario <= 2800.0)
        	System.out.println("IR = 7.5%");
        else if (salario >= 2800.01 && salario <= 3751.0)
        	System.out.println("IR = 15%");
        else
        	System.out.println("IR = 22.5%");
    }
}