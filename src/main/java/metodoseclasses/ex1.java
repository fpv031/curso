package metodoseclasses;

import java.util.Scanner;

public class ex1 {
    public static void verificarNumero(double numero) {
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();
        verificarNumero(numero);
        sc.close();
    }
}
