package ternaria;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        String resultado = (numero1 > numero2) ? "Maior" : "Menor ou Igual";
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
