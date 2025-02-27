package Ead;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o número para a posição (" + i + "," + j + "): ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Soma das linhas:");
        for (int i = 0; i < 4; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da linha " + (i + 1) + ": " + somaLinha);
        }

        System.out.println("Soma das colunas:");
        for (int j = 0; j < 4; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 4; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma da coluna " + (j + 1) + ": " + somaColuna);
        }
    }
}
