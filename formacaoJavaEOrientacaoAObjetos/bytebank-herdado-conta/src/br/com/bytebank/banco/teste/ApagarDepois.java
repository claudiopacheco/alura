package br.com.bytebank.banco.teste;

public class ApagarDepois {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 70000; i++)
            s += i;

        System.out.println(System.currentTimeMillis() - inicio);

        inicio = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 70000; i++)
            sb.append(i);

        s = sb.toString();
        System.out.println(System.currentTimeMillis() - inicio);
    }
}