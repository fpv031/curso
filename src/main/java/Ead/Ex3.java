package Ead;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            numeros.add(sc.nextInt());
        }

        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / numeros.size();
        System.out.println("A média dos números digitados é: " + media);
    }
}
