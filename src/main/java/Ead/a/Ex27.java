package Ead.a;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o número para a posição (" + i + "," + j + "): ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                soma += elemento;
            }
        }

        System.out.println("A soma de todos os elementos é: " + soma);
    }
}
