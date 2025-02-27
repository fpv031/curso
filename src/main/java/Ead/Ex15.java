package Ead;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalSecundaria = 0;

        // Preenchendo a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição (" + i + "," + j + "): ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Somando os elementos da diagonal secundária
        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        System.out.println("A soma dos elementos da diagonal secundária é: " + somaDiagonalSecundaria);
    }
}
