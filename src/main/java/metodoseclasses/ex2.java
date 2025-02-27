package metodoseclasses;

import java.util.Scanner;

public class ex2 {
    public static void verificarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        verificarParOuImpar(numero);
        sc.close();
    }
}
