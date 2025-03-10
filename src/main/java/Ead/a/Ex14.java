package Ead.a;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição (" + i + "," + j + "): ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);
    }
}
