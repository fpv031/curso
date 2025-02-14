package ternaria;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número para verificar se é par ou ímpar: ");
            int numero = sc.nextInt();

            String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
            System.out.println("Resultado: " + resultado);
            sc.close();
        }
    }


