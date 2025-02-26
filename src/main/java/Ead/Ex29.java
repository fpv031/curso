package Ead;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o número para a posição (" + i + "," + j + "): ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 4; j++) {
            int somaColuna = 0;
            for (int[] linha : matriz) {
                somaColuna += linha[j];
            }
            System.out.println("A soma da coluna " + (j + 1) + " é: " + somaColuna);
        }
    }
}
