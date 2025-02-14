package ternaria;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é positivo, negativo ou zero: ");
        int numero = sc.nextInt();

        String resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero";
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
