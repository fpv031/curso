package exercicioscomobjeto;

import java.util.Scanner;

public class ex2basico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        String parOUimpar = verificarNumero(numero);

        System.out.println(verificarNumero(numero));

        sc.close();
    }

    public static String verificarNumero(int numero) {
        String texto;

        if (numero % 2 == 0) {
            texto = "O número é par.";
        } else {
            texto = "O número é ímpar.";
        }
        return  texto;
    }
}

