package Ead;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }

        System.out.print("Digite um número para multiplicar os elementos da lista: ");
        int multiplicador = sc.nextInt();

        for (int numero : numeros) {
            System.out.println(numero * multiplicador);
        }
    }
}
