package ternaria;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        String resultado = (numero > 100) ? "Alto" : "Baixo";
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
