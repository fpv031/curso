package exercicioscomobjeto;

import java.util.Scanner;

public class ex4obj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mensagemIntervalo;

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero >= 10 && numero <= 50) {
            mensagemIntervalo = "O número " + numero + " está dentro do intervalo de 10 a 50.";
        } else {
            mensagemIntervalo = "O número " + numero + " não está dentro do intervalo de 10 a 50.";
        }

        System.out.println(mensagemIntervalo);

        sc.close();
    }
}
