package Ead;

import java.util.Random;

public class Ex18 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] matriz = new int[4][4];
        int soma = 0;
        int totalElementos = 0;

        // Preenchendo a matriz com números aleatórios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rd.nextInt(100) + 1; // números aleatórios de 1 a 100
                soma += matriz[i][j];
                totalElementos++;
            }
        }

        double media = (double) soma / totalElementos;
        System.out.println("A média dos elementos da matriz é: " + media);
    }
}
